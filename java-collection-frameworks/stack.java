package proj;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<>();
		stk.push("animal1");
		stk.push("animal2");
		stk.push("animal3");
		stk.push("animal4");
		stk.push("animal5");
		stk.push("animal6");
		System.out.println("the stack has " + stk);
		System.out.println("the top is " +stk.peek());
		stk.pop();
		System.out.println("the top is " +stk.peek());
	}

}
