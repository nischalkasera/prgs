package proj;

import java.util.HashMap;
import java.util.Map;

public class map {
	public static void main(String[] args) {
		Map<String, Integer> nums = new HashMap<>();
		nums.put("us", 1);
		nums.put("uk", 2);
		nums.put("ind", 3);
		nums.put("fra", 4);
		nums.put("arg", 5);
		System.out.println(nums);
		if(!nums.containsKey("arg")) {
			nums.put("arg", 6);
		}
		nums.putIfAbsent("arg", 6);
		System.out.println(nums);
		for(Map.Entry<String, Integer> e: nums.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
	}
}
