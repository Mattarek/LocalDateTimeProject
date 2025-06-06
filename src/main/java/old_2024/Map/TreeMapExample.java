package old_2024.Map;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
	public static void main(final String[] args) {
		final Map<String, String> map = new TreeMap<>();
		map.put("apple", "fruit");
		map.put("carrot", "vegetable");
		map.put("banana", "fruit");

		System.out.println(map); // {apple=fruit, banana=fruit, carrot=vegetable} - posortowane według kluczy
	}
}
