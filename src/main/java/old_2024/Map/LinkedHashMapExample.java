package old_2024.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main(final String[] args) {
		final Map<String, String> map = new LinkedHashMap<>();
		map.put("apple", "fruit");
		map.put("carrot", "vegetable");

		System.out.println(map); // {apple=fruit, carrot=vegetable} - zachowuje kolejność dodania
	}
}
