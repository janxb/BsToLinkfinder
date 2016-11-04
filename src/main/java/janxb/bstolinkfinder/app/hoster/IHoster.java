package janxb.bstolinkfinder.app.hoster;

import org.jsoup.nodes.Document;

public interface IHoster {
    public String getIdentifier();

    public String getDownloadLinkFromDocument(Document document);
}
