package janxb.bstolinkfinder.app.hoster;

import org.jsoup.nodes.Document;

public class OpenLoad implements IHoster
{
    public String getIdentifier() {
        return "OpenLoad";
    }

    public String getDownloadLinkFromDocument(Document document) {
        return null;
    }
}
