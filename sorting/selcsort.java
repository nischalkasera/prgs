package sorting;

// selection sort

import java.util.Scanner;

public class selcsort {

	public static void main(String[] args) {
		int n;
		int arr[] = new int[100];
		System.out.print("Enter the value of n and arrays\n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		selcSort(arr,n);
		System.out.print("Elements of array are\n");
		
		for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }   
        sc.close();
    }
	
	public static void selcSort(int[] arr, int n) {
		int min, temp;
		for (int i = 0; i < n-1; i++)
        {
			// Find the minimum element in unsorted array
            min = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;
            // Swap the found minimum element with the first element
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
	}
}
