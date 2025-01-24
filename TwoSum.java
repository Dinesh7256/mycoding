import java.util.Scanner;

public class TwoSum {
    public static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,2,4};
        int target = 6;
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int rest = target - arr[i];
                if(arr[j]== rest){
                    ans[i] = i;
                    ans[j]  = j;
                }
            }
        }

        printArray(ans);
    }
}
