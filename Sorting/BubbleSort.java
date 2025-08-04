package Sorting;

public class BubbleSort {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {

    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 1, 9, 8, 7};
        System.out.println("Unsorted Array");
        printArray(arr);
        int n = arr.length;
// implement flag
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array");
        printArray(arr);
    }
}