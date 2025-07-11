package current_2025_czerwiec.ProgramowanieFunkcyjne.WbudowaneInterfaceFunkcyjneJava.Zadania1;

import java.util.function.BiFunction;

public class Main {
	// 1. Napisz implementacjęinterfejsu funkcujnego java.util.function.BiFunction, który przyjmie
	// Integera oraz Double, a zwróci String. Implementacja w trakcie wywołania wydrukuje na ekranie 2 pokazane
	// argumenty, a na koniec zwróci dodane do siebie Integer oraz Double jako String stosująć konkatenację.
	// Pisząc implementację tego interfejsu tego interfejsu interfejsu użyj mechanizmu method reference.
	public static void main(final String[] args) {
		final BiFunction<Integer, Double, String> biFunction = Main::getString;
		biFunction.apply(1, 2.1);
	}

	private static String getString(final Integer i, final double d) {
		System.out.println("First param: " + i);
		System.out.println("Second param: " + d);
		return "" + i + d;
	}
}
