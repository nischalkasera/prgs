package linklist;

import java.util.NoSuchElementException;

public class doublink {
	
	private static listNode head;
	private static listNode tail;
	private static int length;
	
	private static class listNode{
		private int data;
		private listNode next;
		private listNode prev;
		
		public listNode(int data) {
			this.data = data;
		}
	}
	
	public doublink() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public static void main(String[] args) {
		insLast(5);
		insLast(10);
		insLast(24);
		insLast(46);
		insLast(32);
//		insFirst(59);
//		insFirst(29);
//		insFirst(89);
//		insFirst(49);
//		insFirst(79);
//		insFirst(99);
		dispFrnt();
//		dispBack();
//		delFirst();
		delEnd();
		delEnd();
		delEnd();
		dispFrnt();
	}
	
	public static boolean isEmpty() {
		return length == 0;
	}
	
	public static int length() {
		return length;
	}
	
	public static void insLast(int val) {
		listNode newnode = new listNode(val);
		if(isEmpty()) {
			head = newnode;
		} else {
			tail.next = newnode; 
			newnode.prev = tail;
		}	
		tail = newnode;
		length++;
	}
	
	public static void insFirst(int val) {
		listNode newnode = new listNode(val);
		if(isEmpty()) {
			tail = newnode;
		} else {
			head.prev = newnode; 	
		}
		newnode.next = head;
		head = newnode;
		length++;
	}
	
	public static void dispFrnt() {
		if (head == null)
			return;
		listNode temp= head;
		while(temp!=null) {
			System.out.print(temp.data+" -->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public static void dispBack() {
		if(tail == null)
			return;
		listNode temp= tail;
		while(temp!=null) {
			System.out.print(temp.data+" -->");
			temp = temp.prev;
		}
		System.out.println("null");
	}
	
	public static listNode delFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		listNode temp = head;
		if(head == tail) {
			tail = null;
		} else {
			head.next.prev = null;
		}
		head = head.next;
		temp.next = null;
		length--;
		return temp;
	}
	
	public static listNode delEnd() {
		if(isEmpty())
			throw new NoSuchElementException();
		listNode temp = tail;
		if(tail == head) {
			head = null;
		} else {
			tail.prev.next = null;
		}
		tail = tail.prev;
		temp.prev = null;
		length--;
		return temp;
	}
	

}
