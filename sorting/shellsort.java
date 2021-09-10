package sorting;

import java.util.Scanner;

//shell sort

public class shellsort {

	public static void main(String[] args) {
		int n;
		int arr[] = new int[100];
		System.out.print("Enter the value of n and arrays\n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		shlSort(arr,n);
		System.out.print("Elements of array are\n");
		
		for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }   
        sc.close();
	}
	
	public static void shlSort(int[] arr, int n) {
		// Start with a big gap, then reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i += 1)
            {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = arr[i];
 
                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
 
                // put temp (the original a[i]) in its correct
                // location
                arr[j] = temp;
            }
        }
	}
}
