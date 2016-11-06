package janxb.bstolinkfinder;

import janxb.bstolinkfinder.app.Linkfinder;
import janxb.bstolinkfinder.app.LinkfinderResponse;
import janxb.bstolinkfinder.app.hoster.OpenLoad;
import janxb.bstolinkfinder.app.hoster.Vivo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Linkfinder linkfinder = new Linkfinder("Futurama", 2, new Vivo());
        LinkfinderResponse result = linkfinder.getDownloadLinks();
        for (String url : result.DownloadUrls) {
            System.out.println(url);
        }
        if (result.isEpisodesNotFound()) {
            System.out.println("WARNING: " + result.EpisodesNotFoundNum + " Episodes were not available!");
        }
    }
}
