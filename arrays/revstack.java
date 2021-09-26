package arrays;

import java.util.Stack;

// reversing a stack

public class revstack {

	public static void main(String[] args) {
		String str = "teststring";
		System.out.println("Before reversing - "+str);
		System.out.println("After reversing - "+ revStk(str));
	}
	
	public static String revStk(String str) {
		Stack<Character> stack = new Stack<>();
		char[] chars = str.toCharArray();
		for(char c : chars) {
			stack.push(c);
		}
		for(int i = 0; i<str.length(); i++) {
			chars[i] = stack.pop();
		}
		return new String(chars);
	}
}


