package arrays;

//moving zeros in a given array towards the rightmost side

import java.util.Scanner;

public class movezero {

	public static void main(String[] args) {
		int n;
		int arr[] = new int[100];
		System.out.print("Enter the value of n and arrays\n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		movZero(arr, n);
		display(arr, n);
        sc.close();
	}
	
	public static void display(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
	}
	
	public static void movZero(int[] arr, int n) {
		int j = 0;
		for(int i=0 ; i<n; i++) {
			if(arr[i]!=0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		if(arr[j]!=0) {
			j++;
		}
		}
	}

}
