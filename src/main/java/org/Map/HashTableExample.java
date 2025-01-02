package org.Map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
	public static void main(final String[] args) {
		final Map<String, String> map = new Hashtable<>();
		map.put("apple", "fruit");
		map.put("carrot", "vegetable");

		System.out.println(map); // {apple=fruit, carrot=vegetable}
	}
}
