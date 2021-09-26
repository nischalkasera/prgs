package reversing;
/*
 * Using StringBuffer: String class does not have reverse() method,
 *  we need to convert the input string to StringBuffer, which is achieved by 
 *  using the reverse method of StringBuffer. 

 */
public class revstrbuff {
	 public static void main(String[] args)
	    {
	        String str = "qwertyuiop";
	        StringBuffer sbr = new StringBuffer(str);
	        sbr.reverse();
	        System.out.println(sbr);
	    }
}
