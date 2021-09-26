package swapping;


public class swapchar {
	public static void main(String[] args) {
		String str1 = "asdf",  str2 = "qwert";
		//tempMethod(str1, str2);
		swap(str1, str2);
	}
	
	//using a temp variable 
	public static void tempMethod(String str1, String str2){
		String temp;
		temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println("After swapping, string str1 = "+str1+" & str2 = "+str2);
	}
	
	//using + & - no third variable
	public static void swap(String str1, String str2) {
		str1 = str1 + str2;  // append 2nd string to 1st
		str2 = str1.substring(0, str1.length()-str2.length());  // store initial string a in string b
		str1 = str1.substring(str2.length()); // store initial string b in string a
		System.out.println("After swapping, string str1 = "+str1+" & str2 = "+str2);
	}
	
}
