package proj;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue {
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.offer(48);
		pq.offer(12);
		pq.offer(24);
		pq.offer(36);
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		System.out.println(pq.peek());
	}
}
