package linklist;


// here we detect a loop in linked list

public class looplink {

	private static listNode head;
	private static class listNode{
		private int data;
		private listNode next;
		
		public listNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static void main(String[] args) {
		newSll();
		rLoop();
		display(head);
	}
	
	public static void newSll() {
		head = new listNode(1);
		 listNode second = new listNode(2);
		 listNode third = new listNode(3);
		 listNode fourth = new listNode(4);
		 listNode fifth = new listNode(5);
		 listNode sixth = new listNode(6);
		 head.next = second;  //10-->1
		 second.next = third;	//10-->1-->5
		 third.next = fourth;
		 fourth.next = fifth;
		 fifth.next = sixth;
		 sixth.next = third;
	}
	
	
	public static void display(listNode head) {
		listNode current = head;
		System.out.println();
		 while(current!=null) {
			 System.out.print(current.data+"-->");
			 current = current.next; 		 
		 }
		 System.out.print("null");
	}
	
	//detecting a loop in sll
	public static boolean chkLoop() {
		listNode fptr = head;
		listNode sptr = head;
		while(fptr != null && fptr.next != null) {
			fptr = fptr.next.next;
			sptr = sptr.next;
			if(sptr == fptr) {
				return true;
			}
		}
		return false;
	}
	
	//finding starting point of the loop
	public static listNode startLoop() {
		listNode fptr = head;
		listNode sptr = head;
		while(fptr != null && fptr.next != null) {
			fptr = fptr.next.next;
			sptr = sptr.next;
			if(sptr == fptr) {
				return getStart(sptr);
			}
		}
		return null;
	}
	
	public static listNode getStart(listNode sptr) {
		listNode temp = head;
		while(temp!=sptr) {
			temp = temp.next;
			sptr = sptr.next;
		}
		return temp;
	}
	//removing the loop in a sll
	public static void rLoop() {
		listNode fptr = head;
		listNode sptr = head;
		while(fptr != null && fptr.next != null) {
			fptr = fptr.next.next;
			sptr = sptr.next;
			if(sptr == fptr) {
				remLoop(sptr);
				return;
			}
		}
	}
	
	public static void remLoop(listNode sptr) {
		listNode temp = head;
		while( temp.next != sptr.next) {
			temp = temp.next;
			sptr = sptr.next;
		}
		sptr.next = null;
	}
	
	
	
	
	
	 
	

}
