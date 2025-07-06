package current_2025_czerwiec.ProgramowanieFunkcyjne.Lambda1;

import java.util.List;

public class Main {
	public static void main(final String[] args) {

		// To utworzenie obiektu i wykonanie metody myTest jest analogiczne,
		// do tego co wykonuje jako lambda, mamy tylko jedną metodę public abstract
		// dlatego też Java wie, ze to ją musze implementować
		final Checkable checkable = new CheckableImpl();
		// System.out.println(checkable.myTest("nie ma: zajaka"));

		// A jako lambda, parametr wejściowy musi być taki sam (i jest String)
		// i wyjściowy, jest bo containts zwraca booleana.
		//		final Checkable checkable1 = (a) -> {
		//			System.out.println("Lambda calling");
		//			a.contains("asd");
		//			return a.contains("zajavka");
		//		};
		//		System.out.println(checkable1);

		final List<String> cities = List.of("Warszawa", "Gdynia", "Szczecin", "Zakopane");
		printIf(cities, value -> value.contains("a"));
	}

	public static void printIf(final List<String> stringsList, final Checkable checker) {
		for (final String string : stringsList) {
			if (checker.myTest(string)) {
				System.out.println(string);
			}
			System.out.println("Off: " + string);
		}
	}
}
