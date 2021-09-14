package linklist;

import java.util.NoSuchElementException;

public class circlink {
	
	private static listNode last;
	private static int length;
	
	private static class listNode{
		private listNode next;
		private int data;
		
		public listNode(int data) {
			this.data = data;
		}
	}
	public circlink() {
		last = null;
		length = 0;
	}
	
	public static int length() {
		return length;
	}
	
	public static boolean isEmpty() {
		return length == 0;
	}
	
	public static void newCll() {
		listNode first = new listNode(50);
		listNode second = new listNode(30);
		listNode third = new listNode(35);
		listNode fourth = new listNode(42);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		last = fourth;
	}
	
	public static void display() {
		if(last == null) {
			return;
		}
		listNode first = last.next;
		while(first != last) {
			System.out.print(first.data + " ");
			first = first.next;
		}
		System.out.print(first.data);
	}
	
	public static void insFirst(int data) {
		listNode temp = new listNode(data);
		if(last == null) {
			last = temp;
		} else {
			temp.next = last.next;
		}
		last.next = temp;
		length++;
	}
	
	public static void insLast(int data) {
		listNode temp = new listNode(data);
		if(last == null) {
			last = temp;
		} else {
			temp.next = last.next;
			last.next = temp;
			last = temp;
		}
		length++;
	}
	
	public static listNode remFirst() {
		if(isEmpty())
			throw new NoSuchElementException();
		listNode temp = last.next;
		if(last.next == last) {
			last = null;
		} else {
			last.next = temp.next;
		}
		temp.next = null;
		length-- ;
		return temp;
	}
	
	public static void main(String[] args) {
		newCll();
		insFirst(25);
		insLast(52);
		remFirst();
		display();
	}

}
