package proj;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
	public static void main(String[] args) {
		Queue<String> testqQueue = new LinkedList<>();
		testqQueue.add("abcd");
		testqQueue.add("qwer");
		testqQueue.add("tyui");
		testqQueue.add("zxcv");
		testqQueue.add("mnbn");
		testqQueue.add("plok");
		testqQueue.add("55");
		testqQueue.offer("ffff");
		System.out.println(testqQueue);
		System.out.println(testqQueue.poll());
		System.out.println(testqQueue.peek());
		testqQueue.remove("plok");
		System.out.println(testqQueue.element());
		System.out.println(testqQueue);
		
	}
}
