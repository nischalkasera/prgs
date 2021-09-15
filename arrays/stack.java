package arrays;

import java.util.EmptyStackException;

public class stack {
	private static listNode top;
	private static int length;
	
	private static class listNode{
		private int data;
		private listNode next;
		
		public listNode(int data) {
			this.data = data;
		}
	}
	
	public static void stack() {
		top = null;
		length = 0;
	}
	
	public static void main(String args[]) {
		System.out.println("Stack");
		push(25);
		push(5);
		push(65);
		push(16);
		System.out.print(peek());
	}
	
	public static void display() {
		System.out.print("null");
	}
	
	public static int length() {
		return length;
	}
	
	public static boolean isEmpty() {
		return length == 0;
	}
	
	public static void push(int data) {
		listNode temp = new listNode(data);
		temp.next = top;
		top = temp;
		length++;
	}
	
	public static int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int res = top.data;
		top = top.next;
		length--;
		return res;
	}
	
	public static int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}
}
