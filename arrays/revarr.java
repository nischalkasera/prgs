package arrays;

//reversing an array

import java.util.Scanner;

public class revarr {
	public static void main(String[] args) {
        int i,n;
        System.out.print("enter the array size and n\n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[1000];
        for(i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        revStr(arr,n);
        //revArr(arr,start,end);
        // also take inputs for starting and ending points. need to initialize them too.
    }

    static void revStr(int[] arr, int n){
        for (int i = n-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
 static void revArr(int arr[], int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	static void printArr(int arr[],int n) {
		for(int i=0;i<n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int n=5,start=0,end=4;
		revArr(arr,start,end);
		printArr(arr,n);
	}
 */
