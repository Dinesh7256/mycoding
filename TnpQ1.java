import java.util.Scanner;

public class TnpQ1 {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i*i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void findSecondLargestAndSmallest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            // For largest and second largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }

            // For smallest and second smallest
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second Largest: Not found (all elements may be same)");
        } else {
            System.out.println("Second Largest: " + secondLargest);
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second Smallest: Not found (all elements may be same)");
        } else {
            System.out.println("Second Smallest: " + secondSmallest);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        findSecondLargestAndSmallest(arr);
    }
}
