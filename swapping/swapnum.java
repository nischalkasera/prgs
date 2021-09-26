package swapping;

public class swapnum {

	public static void main(String[] args) {
		int a = 10, b = 20;
		//tempMethod(a, b);
		//swap(a, b);
		//divSwap(a,b);
		//xorSwap(a,b);
		oneSwap(a,b);
	}
	public static void disp(int str1, int str2) {
		System.out.println("After swapping, string str1 = "+str1+" & str2 = "+str2);
	}
	//using a temp variable 
	public static void tempMethod(int str1, int str2){
		int temp;
		temp = str1;
		str1 = str2;
		str2 = temp;
		disp(str1,str2);
		
	}
	
	//using + & - no third variable
	public static void swap(int str1, int str2) {
		str1 = str1 + str2;  
		str2 = str1 - str2;
		str1 = str1 - str2;
		disp(str1,str2);
	}
	
	//using * & / no third variable
		public static void divSwap(int str1, int str2) {
			str1 = str1 * str2;  
			str2 = str1 / str2;
			str1 = str1 / str2;
			disp(str1,str2);
		}
	
		//using bitwise XOR (^)
		public static void xorSwap(int str1, int str2) {
			str1 = str1 ^ str2;  
			str2 = str1 ^ str2;
			str1 = str1 ^ str2;
			disp(str1,str2);
		}
		
		//single statement
		public static void oneSwap(int str1, int str2) {
			str2 = str1 + str2 - (str1 = str2);
			disp(str1,str2);
		}

}
