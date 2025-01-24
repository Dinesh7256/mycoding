import java.util.Scanner;

public class SnakePattern {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of pattern: ");
            int n = sc.nextInt();
            int bigNum = n * (n + 1) / 2;
            for (int i = 1; i <= n; i++) {
                int start = bigNum;
                if (i % 2 != 0) {
                    for (int j = 0; j < n - i + 1; j++) {
                        System.out.print((start - j) + " ");
                    }
                } else {
                    for (int j = n - i; j >= 0; j--) {
                        System.out.print((start - j) + " ");
                    }
                }
                bigNum -= (n - i + 1);
                System.out.println();
            }
        }
    }

//
//            55 54 53 52 51 50 49 48 47 46
//            37 38 39 40 41 42 43 44 45
//            36 35 34 33 32 31 30 29
//            22 23 24 25 26 27 28
//            21 20 19 18 17 16
//            11 12 13 14 15
//            10 9 8 7
//            4 5 6
//            3 2
//            1
