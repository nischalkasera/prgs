package sorting;

import java.util.Scanner;

//merge sort

public class mergsort {

	public static void main(String[] args) {
		int n;
		int arr[] = new int[100];
		System.out.print("Merge sort\nEnter the value of n and arrays\n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		mrgSort(arr, n);
		System.out.print("Elements of array are\n");
		
		for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }   
        sc.close();
	}
	
	public static void mrgSort(int[] a, int n) {
	    if (n < 2) {
	        return;
	    }
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];
	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    mrgSort(l, mid);
	    mrgSort(r, n - mid);
	    merge(a, l, r, mid, n - mid);
	}
	
	public static void merge(int[] a, int[] l, int[] r, int left, int right) {
		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i] <= r[j]) {  //change l[i] >= r[j] for desc order
				a[k++] = l[i++];
			}
			else {
			    a[k++] = r[j++];
			}
		}
		while (i < left) {
			a[k++] = l[i++];
		}
		while (j < right) {
			a[k++] = r[j++];
		}
	}
}
