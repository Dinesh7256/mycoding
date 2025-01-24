import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int num = 1; num <= 3; num++) {
                for (int count = 1; count <= i; count++) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();


        }
    }

}

