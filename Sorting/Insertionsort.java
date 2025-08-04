package Sorting;

public class Insertionsort {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {2, 4, 5, 6, 3, 1, 7};
        int n = arr.length;
        System.out.println("Unsorted Array:");
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i]+" ");
        }

        for (int i = 1; i < n; i++) {
            int j= i;

            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
        System.out.println("\nSorted Array: ");
        printArray(arr);
    }
}
