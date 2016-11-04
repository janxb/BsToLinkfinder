package janxb.bstolinkfinder.app;

import janxb.bstolinkfinder.app.hoster.IHoster;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Linkfinder {
    private String seriesName;
    private int seriesNumber;
    private IHoster hoster;
    private static final String BASEURL = "https://bs.to/";

    public Linkfinder(String seriesName, int seriesNumber, IHoster hoster) {
        this.seriesName = seriesName;
        this.seriesNumber = seriesNumber;
        this.hoster = hoster;
    }

    public String[] getDownloadLinks() {
        String url = BASEURL + "serie/" + seriesName + "/" + seriesNumber + "";
        Document startPage = Browser.downloadWebsite(url);

        String hosterIdentifier = hoster.getIdentifier();
        Elements links = startPage.select("table").first().select("tbody tr a." + hosterIdentifier);
        for (Element link : links) {
            String episodeUrl = BASEURL + link.attr("href");

            Document episodePage = Browser.downloadWebsite(episodeUrl);
            String downloadLink = hoster.getDownloadLinkFromDocument(episodePage);

            System.out.println(downloadLink);

        }

        return null;
    }


}
