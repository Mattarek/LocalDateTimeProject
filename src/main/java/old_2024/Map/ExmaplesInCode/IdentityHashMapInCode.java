package old_2024.Map.ExmaplesInCode;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapInCode {
	public static void main(final String[] args) {
		// Tworzymy IdentityHashMap, która porównuje klucze na podstawie referencji, uzywa == zamisat equal
		final Map<String, String> map = new IdentityHashMap<>(5);

		final String str1 = "Hello";
		final String str2 = "Hello";

		final String str3 = "Helloo";

		// Dodajemy obie instancje obiektu "Hello"
		map.put(str1, "World");
		map.put(str2, "World1"); // Drugi klucz Hello nadpisuje pierwszy zawarty w kodzie
		map.put(str3, "Java");

		// Zwróci dwie różne pary, ponieważ porównanie kluczy odbywa się na poziomie referencji
		System.out.println(map); // {Hello=World, Hello=Java}
	}
}
