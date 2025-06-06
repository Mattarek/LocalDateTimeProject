package old_2024.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(final String[] args) {
		final Map<String, String> map = new HashMap<>();
		map.put("apple", "fruit");
		map.put("carrot", "vegetable");
		map.put("test1", "vegetable");
		map.put("test2", "vegetable");
		map.put("test3", "vegetable");
		map.put("test4", "vegetable");
		map.put("test5", "vegetable");

		System.out.println(map); // {apple=fruit, carrot=vegetable}
	}
}
