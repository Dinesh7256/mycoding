class CreditCard{
    int CardNo =1234;
    int pin = 5178;
}

class Hacker extends CreditCard {
    void details() {
        System.out.println("Card Number:" + CardNo);
        System.out.println("CARD Pin: " + pin);
    }

    void changeDetails() {
        CardNo = 5424;
        pin = 8765;
    }
}

 class Main {
    public static void main(String[] args) {
        Hacker h1 = new Hacker();
        h1.details();
        h1.changeDetails();
    }
}