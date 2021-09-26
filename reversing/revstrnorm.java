package reversing;
//Converting String into Bytes: getBytes() method is used to convert the
//input string into bytes[]
/*
 * 1. Create a temporary byte[]  of length equal 
   to the length of the input string.
2. Store the bytes (which we get by using 
   getBytes() method) in reverse order into 
   the temporary byte[] .
3. Create a new String abject using byte[] to
   store result.
 */

public class revstrnorm {

	 public static void main(String[] args)
	    {
	        String input = "qwertyuiop";
	        byte[] arr = input.getBytes();
	        byte[] result = new byte[arr.length];
	        for (int i = 0; i < arr.length; i++)
	            result[i] = arr[arr.length - i - 1];
	        System.out.println(new String(result));
	    }
}
