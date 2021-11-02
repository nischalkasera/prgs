package proj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collectionclass {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(45);
		lst.add(65);
		lst.add(25);
		lst.add(35);
		lst.add(75);
		lst.add(75);
		lst.add(75);
		lst.add(75);
		lst.add(22);
		System.out.println("min ele is "+Collections.min(lst));
		System.out.println("max ele is "+Collections.max(lst));
		System.out.println("freq of ele is "+Collections.frequency(lst, 75));
		Collections.sort(lst);
		Collections.sort(lst, Comparator.reverseOrder());
		System.out.println("Sorted arrays is ");
		for (Integer i : lst) {
			System.out.print(i+" ");
		}
	}
}
