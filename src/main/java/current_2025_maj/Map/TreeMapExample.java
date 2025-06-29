package current_2025_maj.Map;

import java.util.TreeMap;

//📌 Cechy:
//	- Przechowuje klucze w kolejności naturalnej (lub zdefiniowanej przez Comparator).
//	- Wolniejsza niż HashMap, ale pozwala na operacje sortujące (subMap, firstKey, itp.).
public class TreeMapExample {
	public static void main(final String[] args) {
		final TreeMap<String, Integer> phoneBook = new TreeMap<>();
		phoneBook.put("Kasia", 123456);
		phoneBook.put("Adam", 9876);
		phoneBook.put("Zofia", 654567);
		for (final String name : phoneBook.keySet()) {
			System.out.println(name + ": " + phoneBook.get(name));
		}
	}
}
