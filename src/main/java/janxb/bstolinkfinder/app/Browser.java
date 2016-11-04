package janxb.bstolinkfinder.app;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Browser {
    public static Document downloadWebsite(String url) {
        try {
            return Jsoup
                    .connect(url)
                    .userAgent(
                            "Mozilla/5.0 (Windows NT 6.2; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/32.0.1667.0 Safari/537.36")
                    .timeout(20000).get();
        } catch (IllegalArgumentException e) {
            return new Document("");
        } catch (IOException e) {
            return new Document("");
        }
    }
}
