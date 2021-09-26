package arrays;

import java.util.Scanner;

public class resizearr {
	public static void main(String[] args) {
		System.out.print("Enter the value of n and arrays\n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("elements in the array are as follows:");
		display(arr);
		System.out.println("Size of current array is "+arr.length +"\nEnter the count of new array\n");
		int count = sc.nextInt();
		arr = rsizArr(arr, count);
		System.out.println("Size of updated array is "+arr.length);
		//display(arr);
	    sc.close();
}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] rsizArr(int[] arr, int count) {
		int[] temp = new int[count];
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		return temp;
	}
}