
// Java program for implementation of Selection Sort
import java.io.*;

public class Sorter {
    void selectionSort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    static void insertionsort(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			/* Move elements of arr[0..i-1], that are
			greater than key, to one position ahead
			of their current position */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
    // Prints the array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    
    public static void main(String args[]) {
        Sorter ob = new Sorter();
        int arr[] = { 64, 25, 12, 22, 11 };
        //ob.selectionSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
        int arr1[] = { 12, 11, 13, 5, 6 };

		Sorter ob1 = new Sorter();
		ob1.insertionsort(arr1);
        sort(arr);
        System.out.println("TEST");
        printArray(arr);

		printArray(arr1);


    }
    private static void sort(int [] arr) {
        insertionsort(arr);
    }
}
/* This code is contributed by Rajat Mishra */
