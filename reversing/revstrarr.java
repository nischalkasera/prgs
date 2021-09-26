package reversing;
 //Converting String to character array: The user input the string to be reversed. 
/*
 * 1. First, convert String to character array by using the built in Java String class 
   method toCharArray().
2. Then, scan the string from end  to start, and print the character one by one.
 */

public class revstrarr {
	
	 public static void main(String[] args)
	    {
	        String input = "qwertyuiop";
	        char[] arr = input.toCharArray();
	         for (int i = arr.length - 1; i >= 0; i--)
	            System.out.print(arr[i]);
	    }

}
