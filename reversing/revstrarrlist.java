package reversing;
/*
 * Using ArrayList object: Convert the input string into the character array 
 * by using toCharArray() built in method. Then, add the characters of the array 
 * into the ArrayList object. Java also has built in reverse() method for the Collections
 *  class. Since Collections class reverse() method takes a list object, to reverse 
 *  the list, we will pass the ArrayList object which is a type of list of characters.
 *  
 *  1. We copy String contents to an object of ArrayList. We create a ListIterator 
 *  object by using the listIterator() method on the ArrayList  object.
2. ListIterator object is used to iterate over 
   the list.
3. ListIterator object helps us to iterate 
   over the reversed list and print it one 
   by one to the output screen.
 */
import java.util.*;

public class revstrarrlist {
	public static void main(String[] args)
    {
        String input = "qwertyuiop";
        char[] hello = input.toCharArray();
        List<Character> arr = new ArrayList<>();
        for (char c : hello)
            arr.add(c);
        Collections.reverse(arr);
        ListIterator<Character> li = arr.listIterator();
        while (li.hasNext())
            System.out.print(li.next());
    }
}
