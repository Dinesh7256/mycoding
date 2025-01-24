/////////POLYMORPHISM ////
//METHOD OVERLOADING


class Siya{
    public void Ram(){
        System.out.println("Java");
    }

    public void Ram(int a){
        System.out.println("J2EE");
    }

    public void Ram(int a, double d) {
        System.out.println("SQL");
    }

    public void Ram(int a, String s){
        System.out.println("Data Base");
    }

    public void Ram(String s, double d) {
        System.out.println("Python");
    }

    public void Ram(double d) {
        System.out.println("Advance java");
    }
}

public class Drive {

    public static void main(String[] args){
        Siya s1 = new Siya();
        s1.Ram();
        s1.Ram(5.00);
        s1.Ram(5);
        s1.Ram(5, 5.00);
        s1.Ram("dinesh", 5.00);
        s1.Ram(69,"LikeIt");
    }

}
