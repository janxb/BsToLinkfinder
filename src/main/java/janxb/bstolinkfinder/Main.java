package janxb.bstolinkfinder;

import janxb.bstolinkfinder.app.Linkfinder;
import janxb.bstolinkfinder.app.hoster.OpenLoad;

public class Main {
    public static void main(String[] args) {
        Linkfinder linkfinder = new Linkfinder("Criminal-Minds", 1, new OpenLoad());
        linkfinder.getDownloadLinks();
    }
}
