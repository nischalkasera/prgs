package proj;

import java.util.ArrayDeque;

public class deque {
	public static void main(String[] args) {
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		adq.offer(55);
		adq.offer(65);
		adq.offer(75);
		adq.offer(85);
		adq.offer(95);
		adq.offer(45);
		adq.offerFirst(1212);
		adq.offerLast(8585);
		System.out.println(adq);
		System.out.println(adq.poll());
		System.out.println(adq.remove());
		System.out.println(adq.peek());
		System.out.println(adq.pollFirst());
		System.out.println(adq.pollLast());
	}
}
