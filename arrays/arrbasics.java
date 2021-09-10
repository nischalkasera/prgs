package arrays;

import java.util.Scanner;

//basics of array input and output


public class arrbasics {

	public static void main(String[] args) {
		int n;
		int arr[] = new int[100];
		System.out.print("Enter the value of n and arrays\n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Elements of array are\n");
		
		for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }   
        sc.close();
	}

}
