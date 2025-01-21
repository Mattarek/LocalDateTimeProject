package org.Collections.Vector;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

public class Main {
	public static void main(final String[] args) {
		// Tablice z stałą ilością elementów, rezerwowana wczesniej, o stałym typie, o ile go określimy
		// Możemy określić Objet[], aby przechowywać dane różnych typów:
		final Object[] qwe = new Object[10];
		qwe[0] = "1";
		qwe[1] = 2;
		qwe[2] = 'E';
		qwe[3] = null;
		qwe[7] = new int[]{10, 20, 30};
		final Object q = qwe[2];
		System.out.println(q);
		System.out.println(Arrays.toString(qwe));

		// Tablica z stałym typem
		final int[] intery = new int[10];
		intery[0] = 2;
		intery[1] = 3;
		intery[5] = 4;
		intery[9] = 2;
		System.out.println(Arrays.toString(intery));

		// Przed Javą 1.2 nie było "Kolekcji", była tablica, vector i hashtable,
		// W 1.2 wprowadzili kolekcje i przerobili Vector aby był kolekcją,
		// czyli Vector implementuje z interface Collection.

		// hashtable przechowuje klucz i wartosc
		final Hashtable hashtable = new Hashtable();
		hashtable.put("Robert", 1);
		hashtable.put("Marcin", 2);
		hashtable.put("Andrzej", 3);
		final Object c = hashtable.get("Marcin"); // 2
		System.out.println(c);

		//
		final Vector vector = new Vector();
		vector.addElement("Element1");
		vector.addElement(1);
		System.out.println(vector);

		//===========================================================
		// Tworzenie pustej ArrayList
		final ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Warsaw");
		arrayList.add("Lodz");
		arrayList.add("Rzeszow");
		arrayList.add("Rzeszow");
		arrayList.add("Rzeszow");
		arrayList.add("Rzeszow");
		arrayList.add("Rzeszow");
		arrayList.add(5, "Krakow");
		arrayList.add(6, "Krakow");

		System.out.println(arrayList);
	}
}
