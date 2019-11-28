package ARF;

public class University {
    public String universityName="null";
    public boolean hasCampus;
    public University(){}

    public University(String naam){
        this.universityName=naam;
    }
    public University (String naam, boolean b){
        this.universityName=naam;
        this.hasCampus=b;
    }

}
