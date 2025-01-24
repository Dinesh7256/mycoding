import java.util.Scanner;
class Film{
    String film_name;
    double film_budget;
    String film_director;

    void ratingOfFilm(){
        System.out.println("5Star");
    }
}
class Actor extends Film{
    String Actor_name;
    String Actor_remu;
    void performance(){
        System.out.println("SUPER");
    }
}
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Actor A1 = new Actor();


    }
}
