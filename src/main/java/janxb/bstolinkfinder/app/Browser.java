package janxb.bstolinkfinder.app;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.*;

public class Browser {
    private static Map<String, Integer> retryCounter = new HashMap<String, Integer>();
    public static int retryCount = 3;

    public static Document downloadWebsite(String url) {
        try {
            return Jsoup
                    .connect(url)
                    .userAgent(
                            "Mozilla/5.0 (Windows NT 6.2; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/32.0.1667.0 Safari/537.36")
                    .timeout(20000).get();
        } catch (IllegalArgumentException e) {
            return null;
        } catch (HttpStatusException e) {
            int curRetries = retryCounter.get(url) != null ? retryCounter.get(url) : 0;
            if (curRetries < retryCount) {
                retryCounter.put(url, ++curRetries);
                return downloadWebsite(url);
            }
        } catch (IOException e) {
            return null;
        }
        return null;
    }
}
