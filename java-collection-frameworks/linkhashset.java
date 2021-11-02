package proj;

import java.util.LinkedHashSet;
import java.util.Set;

public class linkhashset {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(44);
		set.add(12);
		set.add(96);
		set.add(32);
		System.out.println(set);
		set.remove(32);
		System.out.println(set);
		System.out.println(set.contains(12));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.clear();
		System.out.println(set);
	}
}
