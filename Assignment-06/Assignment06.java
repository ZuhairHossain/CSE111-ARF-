package ARF;
import java.util.Scanner;
public class Assignment06 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Anime a1 =new Series();

    Series a2 = new Series();

    System.out.println("Please enter a name of Anime");
    a1.setAnimeName(sc.nextLine());
    System.out.println("Please enter the Type of Anime");
    a1.setAnimeType(sc.nextLine());
    System.out.println("PLease enter the Genre of Anime");
    a1.setAnimeGenre(sc.nextLine());
    System.out.println("Please enter total Series Number of the Anime");

    a2.setTotalSeries(sc.nextInt());
    System.out.println("");

    }
}
