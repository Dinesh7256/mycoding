package JANUARY_TNP;
import java.util.*;
public class Question1 {
    public static int minDifference(int[] arr, int n) {
        int mindiff;
        Arrays.sort(arr);
        return mindiff = arr[n - 1] - arr[0];
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 5;
        System.out.println(minDifference(arr, m));
    }
}
