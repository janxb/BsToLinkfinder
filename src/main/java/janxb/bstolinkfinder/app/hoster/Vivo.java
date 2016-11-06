package janxb.bstolinkfinder.app.hoster;

import janxb.bstolinkfinder.app.Browser;
import janxb.bstolinkfinder.app.DownloadNotExistingException;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Vivo implements IHoster {
    @Override
    public String getIdentifier() {
        return "Vivo";
    }

    @Override
    public String getDownloadLinkFromDocument(Document document) throws DownloadNotExistingException {
        String url = document.select("a[target=\"_blank\"]").first().attr("href");
        Document downloadPage = Browser.downloadWebsite(url);
        Element deletedNotice = downloadPage.select("div.jumbotron.deleted").first();
        if (deletedNotice != null)
            throw new DownloadNotExistingException();

        return url;
    }
}
