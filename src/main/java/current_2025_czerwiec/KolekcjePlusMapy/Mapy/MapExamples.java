package current_2025_czerwiec.KolekcjePlusMapy.Mapy;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
	public static void main(final String[] args) {
		final Map<String, String> stringMap = new HashMap<>();
		stringMap.put("1", "Abc");
		stringMap.put("2", "FGH");
		stringMap.put("3", "ASD");
		stringMap.put("4", "ZXC");
		stringMap.put("5", "DEF");
		//		stringMap.put("5", "DEF");// nadpisze element o kluczu "5"

		//		System.out.println(stringMap);
		System.out.println(stringMap.containsKey("2"));
		System.out.println(stringMap.containsValue("ZXC"));
		System.out.println(stringMap.containsValue("ZXCE"));
		// Iterujemy po wartościach
		//		for (final String value : stringMap.values()) {
		//			System.out.println(value);
		//		}
		//
		//		// Iterujemy po kluczach
		//		for (final String key : stringMap.keySet()) {
		//			System.out.println(key);
		//		}
		//
		//		// Wyciągamy klucz i wartość na raz
		//		for (final Map.Entry<String, String> entry : stringMap.entrySet()) {
		//			System.out.println(entry);
		//		}
	}
}
