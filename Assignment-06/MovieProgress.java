package ARF;

public class MovieProgress extends Anime {
    public boolean status;
    public String dateOfRelease;

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setDateOfRelease(String dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    public String getDateOfRelease() {
        return dateOfRelease;
    }
}
