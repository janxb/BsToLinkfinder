package janxb.bstolinkfinder.app;

import java.util.List;

public class LinkfinderResponse {
    public String SeriesName;
    public int SeriesNumber;
    public int EpisodesNotFoundNum;
    public String[] DownloadUrls;

    public LinkfinderResponse(String SeriesName, int SeriesNumber, int EpisodesNotFoundNum, String[] DownloadUrls) {
        this.SeriesName = SeriesName;
        this.SeriesNumber = SeriesNumber;
        this.EpisodesNotFoundNum = EpisodesNotFoundNum;
        this.DownloadUrls = DownloadUrls;
    }

    public boolean isEpisodesNotFound() {
        return EpisodesNotFoundNum > 0;
    }

    public boolean isEmpty(){
        return DownloadUrls.length == 0;
    }
}
