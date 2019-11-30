package ARF;

public class Anime {
    public String animeName;
    public String animeType;
    public String animeGenre;

    public Anime(){
        this.animeName="default name";
    }

    public Anime(String aninename){
        this.animeName=aninename;
    }

    public void setAnimeName(String animeName) {
        this.animeName = animeName;
    }

    public String getAnimeName() {
        return animeName;
    }

    public void setAnimeType(String animeType) {
        this.animeType = animeType;
    }

    public String getAnimeType() {
        return animeType;
    }

    public void setAnimeGenre(String animeGenre) {
        this.animeGenre = animeGenre;
    }

    public String getAnimeGenre() {
        return animeGenre;
    }

}
