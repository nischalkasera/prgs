package proj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class arrlist {

	public static void main(String[] args) {
		System.out.print("run test\n");
		ArrayList<Integer> list = new ArrayList<>();
		list.add(22);
		list.add(55);
		System.out.println(list);
		list.add(44);
		System.out.println(list);
		List<Integer> test = new ArrayList<Integer>();
		test.add(88);
		test.add(333);
		System.out.println(test);
		list.addAll(test);
		System.out.println(list);
		System.out.println(list.get(4));
		list.remove(4);
		System.out.println(list);
		list.remove(Integer.valueOf(55));
		System.out.println(list);
		list.set(2, 7);
		System.out.println(list);
		System.out.println(list.contains(22));
		for (int i = 0; i < list.size(); i++) {
			System.out.println("the element is " +list.get(i));
		}
		for (Integer integer : list) {
			System.out.println("the element is " +integer);	
		}
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println("Iterator "+ iterator.next());			
		}
		
	}
	
}
