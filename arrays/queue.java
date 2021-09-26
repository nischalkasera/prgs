package arrays;

public class queue {
	private static listNode front;
	private static listNode rear;
	private static int length;
	private static class listNode{
		private int data;
		private listNode next;
		
		public listNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static int length() {
		return length;
	}
	
	public static boolean isEmpty() {
		return length == 0;
	}
	
	
	public static void main(String[] args) {
		

	}

}
