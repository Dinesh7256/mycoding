package Sorting;

public class SelectionSort {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
//        swap function
    }

    static void selectSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            if (min_index != i) {
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 3, 1, 7};
        int n = arr.length;
        System.out.println("Unsorted Array:");
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nSorted array using method:");
        selectSort(arr);
        printArray(arr);
    }
}