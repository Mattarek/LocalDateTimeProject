package megaK.genericClass;

import java.util.ArrayList;
import java.util.List;

public class Purpose {
	public static void main(final String[] args) {
		final List list = new ArrayList<>();
		list.add("2");
		list.add("element");
		list.add("q");
		print(list);

		// W Javie 1.7 wprowadzono diamond operator, czyli wywołanie konstruktora prze <>, juz nie trzeba wpisywać
		// typu recznie
		final List<String> newList = new ArrayList<>();
	}

	private static void print(final List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			final String element = list.get(i);
			System.out.println(element);
		}
	}
}
