package sorting;

import java.util.Scanner;

//insertion sort

public class insersort {

	public static void main(String[] args) {
		int n;
		int arr[] = new int[100];
		System.out.print("Enter the value of n and arrays\n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		inSort(arr,n);
		System.out.print("Elements of array are\n");
		
		for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }   
        sc.close();
	}
	public static void inSort(int[] arr, int n) {
		for (int i = 1; i < n; ++i) {
	    int key = arr[i];
	    int j = i - 1;
/* Move elements of arr[0..i-1], that are greater than key, to one position ahead
	               of their current position */
	    while (j >= 0 && arr[j] > key) {
	    	arr[j + 1] = arr[j];
	        j = j - 1;
	       }
	      arr[j + 1] = key;
	   }
	}
	// use arr[j] < key for desc order
	
	/*public static void inSortRec(int[] arr, int n) {
		
	}*/
}
