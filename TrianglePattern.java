import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size: ");
        int size = sc.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int k = size; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if(i%2==0) {
                    continue;
                }
                else{
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
    }
}


