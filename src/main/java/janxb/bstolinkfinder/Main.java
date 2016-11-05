package janxb.bstolinkfinder;

import janxb.bstolinkfinder.app.Linkfinder;
import janxb.bstolinkfinder.app.hoster.OpenLoad;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Linkfinder linkfinder = new Linkfinder("Scrubs", 45, new OpenLoad());
        String[] result = linkfinder.getDownloadLinks();
        System.out.println(Arrays.toString(result));
    }
}
