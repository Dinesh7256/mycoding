//Constructor overloading //


class Test{
    public Test() {
        System.out.println("Hii");
    }

    public Test(int a, double b) {
        System.out.println("hello");
    }

    public Test(int a, String s) {
        System.out.println("Tata");
    }

    public Test(String s) {
        System.out.println("BYE BYE");
    }

    public Test(double d, int a, double b) {
        System.out.println("Khatam_ tata goody bye");
    }
}

public class Drive2 {
    public static void main(String[] args) {
        Test t = new Test("Dinesh");
    }
}
