package janxb.bstolinkfinder.app.hoster;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class OpenLoad implements IHoster {
    public String getIdentifier() {
        return "OpenLoad";
    }

    public String getDownloadLinkFromDocument(Document document) {
        return document.select("section.serie iframe").first().attr("src");
    }
}
