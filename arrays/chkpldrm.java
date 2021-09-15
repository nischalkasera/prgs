package arrays;

import java.util.Scanner;

public class chkpldrm {

	public static void main(String[] args) {
		System.out.print("Enter the string\n");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		isPalindrome(word);
		if(isPalindrome(word) == true)
		System.out.print("The given string is palindrome\n");
		else
			System.out.print("The given string is not a palindrome\n");
		sc.close();
	}
	
	public static boolean isPalindrome(String word) {
		char[] arr = word.toCharArray();
		int start = 0, end = arr.length - 1;
		while(start<end) {
			if(arr[start] != arr[end])
				return false;
			start++; end--;
		}
		return true;
	}
}
