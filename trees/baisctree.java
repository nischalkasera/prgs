package trees;

public class baisctree {
	
	private static treeroot root;
	private static class treeroot{
		private treeroot left;
		private treeroot right;
		private int data;
		
		public treeroot(int data) {
			this.data = data;
		}
		
	}
	
	public static void insert() {
		treeroot first = new treeroot(10);
		treeroot sec = new treeroot(20);
		treeroot third = new treeroot(30);
		treeroot fourth = new treeroot(40);
		treeroot fifth = new treeroot(50);
		treeroot sixth = new treeroot(60);
		treeroot seventh = new treeroot(70);
		
		root = first;
		first.left = sec;
		first.right = third;
		sec.left = fourth;
		sec.right = fifth;
		third.left = sixth;
		third.right = seventh;
	}
	
	public static void printLeafroots(treeroot root) {
		if (root == null) {
			return; 
			}
		printLeafroots(root.left); 
		System.out.print(" "+ root.data);
		printLeafroots(root.right); 
	}
		
		public static void main(String[] args) {
		insert();
		printLeafroots(root);
	}

}
