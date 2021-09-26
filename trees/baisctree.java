package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


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
	
	public static void main(String[] args) {
		insert();
		insert(root, 80);
		printLeafroots(root);
		//preOrderRec(root);
		//preOrderStk(root);
		//inOrderRec(root);
		//inOrderStk(root);
		//postOrderRec(root);
		//postOrderStk(root);
		//lvlOrder(root);
		System.out.print("Maximum value in the binary tree is -> "+maxVal(root));
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
	
	
	//recursive method pre-order
	/*
	 * V - view or print the node data
	 * L - then perform recursion on left node of the root 
	 * R - finally, perform recursion on the right node of the root
	 */
	public static void preOrderRec(treeroot root) {
		if(root == null) {
			return;
		}
		System.out.print(" "+root.data);
		preOrderRec(root.left);
		preOrderRec(root.right);
	}
		
	//non recursive method pre-order using stack
	/*
	 * Here we first push the right node into the stack as it is LIFO. After pushing the
	 * left node, we pop the node which is on top of the stack and place it in an another
	 * variable stack temp which prints the value in pre-order traversal of tree. Here we 
	 * first push parent's right node into the stack, then its left node. so as it exits the
	 * while loop the top element will be popped and displayed.
	 */
	
	public static void preOrderStk(treeroot root) {
		if(root == null) {
			return;
		}
		Stack <treeroot> stk = new Stack<>();
		stk.push(root);
		while(!stk.isEmpty()) {
			treeroot temp = stk.pop();
			System.out.print(temp.data+" ");
			if(temp.right!=null)
				stk.push(temp.right);
			if(temp.left!=null)
				stk.push(temp.left);
			
		}
	}
	
	//recursive method in-order
		/*
		 * L - perform recursion on left node of the root
		 * V - view or print the node data 
		 * R - finally, perform recursion on the right node of the root
		 */
	/*
	 * Here, we first start with root node. We traverse the left node of the root element.
	 * Now as we come towards the root.left, it becomes the next root node. Then it checks 
	 * for any left node. if it is null, control will return to the parent node and 
	 * print the data of the parent. As the leftmost part is already visited, we now traverse to
	 * the right part of the parent node. Then it becomes the next root node. We check if its left node
	 * is null. If it is so, then we return control to the parent node and print its value.
	 * Similarly, it goes on in recursion.
	 */
	public static void inOrderRec(treeroot root) {
		if(root == null) {
			return;
		}
		inOrderRec(root.left);
		System.out.print(root.data+" ");
		inOrderRec(root.right);
	}
	
	//non recursive method in-order using stack
	/*
	 * we require an additional data structure of type tree node to store the data of the current element
	 * As the stack is LIFO, we first initialize the temp variable equivalent to root. The temp will traverse
	 * all the nodes of the tree. So first we check whether temp or stack is null. if not, then we check for temp
	 * node again if its null or not. we push the temp element into the stack and then check for its left node,
	 * if temp is null then, we pop the topmost element on the stack and print its value. We then visit it right node 
	 * of the parent and then print its value.  
	 */

	public static void inOrderStk(treeroot root) {
		if(root == null)
			return;
		Stack <treeroot> stk = new Stack<>();
		treeroot temp = root;
		while (!stk.isEmpty() || temp != null) {
			if(temp != null) {
				stk.push(temp);
				temp = temp.left;
			} else {
				temp = stk.pop();
				System.out.print(temp.data+" ");
				temp = temp.right;
			}
		}
	}
	
	//recursive method post-order
			/*
			 * L - perform recursion on left node of the root
			 * R - perform recursion on the right node of the root
			 * V - finally view or print the node data 
			 * 
			 */
	public static void postOrderRec(treeroot root) {
		if(root == null)
			return;
		postOrderRec(root.left);
		postOrderRec(root.right);
		System.out.print(root.data+" ");
	}
	
	//non recursive post-order traversal using stack
	/*
	 * explanation: 
	 */
	
	public static void postOrderStk(treeroot root) {
		treeroot current = root;
		Stack <treeroot> stk = new Stack<>();
		while(!stk.isEmpty() || current != null) {
			if(current != null) {
				stk.push(current);
				current = current.left;
			} else {
				treeroot temp = stk.peek().right;
				if(temp == null) {
					temp = stk.pop();
					System.out.print(temp.data+" ");
					while(!stk.isEmpty() && temp == stk.peek().right) {
						temp = stk.pop();
						System.out.print(temp.data+" ");
					}
				} else {
					current = temp;
				}
			}
		}
	}
	
	//level order traversal
	public static void lvlOrder(treeroot root) {
		if(root == null)
			return;
		Queue <treeroot> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			treeroot temp = queue.poll();
			System.out.print(temp.data+" ");
			if(temp.left != null)
				queue.offer(temp.left);
			if(temp.right != null)
				queue.offer(temp.right);
		}
	}
	
	//find maximum value in a binary tree
	public static int maxVal(treeroot root) {
		if(root == null)
			return Integer.MIN_VALUE;
		int res = root.data;
		int left = maxVal(root.left);
		int right = maxVal(root.right);
		if(left>res)
			res = left;
		if(right>res)
			res = right;
		return res;
	}
	
	//inserting an element into a tree
	/*
	 * If we find a node whose left child is empty, we make new key as left child 
	 * of the node. Else if we find a node whose right child is empty, we make the
	 *  new key as right child. We keep traversing the tree until we find a node
	 *   whose either left or right child is empty. 
	 */
	public static void insert(treeroot temp, int key){
        if (temp == null) {
            root = new treeroot(key);
            return;
        }
        Queue<treeroot> q = new LinkedList<treeroot>();
        q.add(temp);
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
            if (temp.left == null) {
                temp.left = new treeroot(key);
                break;
            } else
                q.add(temp.left);
            if (temp.right == null) {
                temp.right = new treeroot(key);
                break;
            } else
            	q.add(temp.right);
        }
    }
}
