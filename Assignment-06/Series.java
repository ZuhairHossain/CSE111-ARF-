package ARF;

public class Series extends Anime {
    public int seasonNumber=0;
    public int totalSeries=0;
    public int numberofEpisodes=0;

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setTotalSeries(int totalSeries) {
        this.totalSeries = totalSeries;
    }

    public int getTotalSeries() {
        return totalSeries;
    }

    public void setNumberofEpisodes(int numberofEpisodes) {
        this.numberofEpisodes = numberofEpisodes;
    }

    public int getNumberofEpisodes() {
        return numberofEpisodes;
    }
}
