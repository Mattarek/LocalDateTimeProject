package current_2025_czerwiec.Generyki;

import old_2024.staticInheritence.A.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericDemo {
	// --------------------
	// Upper bound: czytanie Number
	// --------------------
	public static double sumList(final List<? extends Number> list) {
		double sum = 0.0;
		for (final Number number : list) {
			sum += number.doubleValue();
		}
		return sum;
	}

	// --------------------
	// Lower bound: dodawanie Integer
	// ? super Integer - „To jest lista elementów typu Integer lub jakiegoś nadtypu Integera (np. Number, Object)”.
	// ✅ Co oznacza ? super Integer?
	//	List<? super Integer> znaczy:
	//			„To jest lista elementów typu Integer lub jakiegoś nadtypu Integera (np. Number, Object)”.
	//
	//	Czyli do metody możesz przekazać np.:
	//	List<Integer>
	//	List<Number>
	//	List<Object>
	//
	//  ❌ Dlaczego nie możesz odczytać jako Integer?
	//  Wyobraź sobie, że do metody ktoś przekazał List<Number>:
	//  	List<Number> numbers = new ArrayList<>();
	//  	addSomeNumbers(numbers);
	//
	//	Wewnątrz metody masz tylko gwarancję:
	//			„to jest jakaś lista, której elementy są nadtypami Integera”.
	//
	//	Kompilator nie wie, czy lista faktycznie jest List<Integer>, czy List<Number>, czy List<Object>.
	//	A skoro nie wie, to nie ma gwarancji, że elementy, które już są w liście, są typu Integer.
	//	Mogą być np. Double (jeśli to była List<Number>).
	//
	//	Dlatego przy odczycie kompilator mówi:
	//
	//			„Nie masz gwarancji, że to Integer – możesz to bezpiecznie traktować tylko jako Object”.
	// --------------------
	public static void addSomeNumbers(final List<? super Integer> list) {
		list.add(10);
		list.add(20);
		list.add(30);
		// Nie możemy odczytać jako Integer, musimy jako Object, bo możemy przekazać Number lub Object,
		// dlatego najbezpieczniej jest odczytywać wartość jako Object
		final Object o = list.getFirst();
		System.out.println("Pierwszy element (Object): " + o);
	}

	// --------------------
	// Metoda generyczna: kopiowanie listy
	// --------------------
	public static <T> void copyList(final List<T> source, final List<T> destination) {
		destination.addAll(source);
	}

	// --------------------
	// Miks upper & lower: kopiowanie z ograniczeniami
	// --------------------
	public static <T> void copyWithBounds(final List<? extends T> source, final List<? super T> destination) {
		destination.addAll(source);
	}

	/*
NOTATKI:
========
- Pair<K,V>: klasa generyczna z dwoma typami, przechowuje pary klucz-wartosc.
- sumList: uzywa ? extends Number, moze iterowac po Number i jego podtypach (Integer, Double), ale nie moze dodawac.
- addSomeNumbers: uzywa ? super Integer, mozemy dodac Integer, ale odczyt jest tylko jako Object.
- copyList: metoda generyczna <T>, prosta kopia elementow.
- copyWithBounds: zrodlo ? extends T (czytanie), cel ? super T (pisanie) -> bezpieczne kopiowanie.
*/

	public static void main(final String[] args) {
		// Test Pair
		final Pair<String, Integer> pair = new Pair<>("wiek", 30);
		pair.printPair();

		// test sumList (upperbound)
		final List<Integer> intList = Arrays.asList(1, 2, 3, 4);
		final List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);
		System.out.println("Suma intList: " + sumList(intList));
		System.out.println("Suma doubleList: " + sumList(doubleList));

		// Test addSomeNumbers(lower bound)
		final List<Number> numbers = new ArrayList<>();
		addSomeNumbers(numbers);
		System.out.println("Numbers: " + numbers);

		// Test copyList (generyczna metoda)
		final List<String> sourceStr = Arrays.asList("A", "B", "C");
		final List<String> destStr = new ArrayList<>();
		copyList(sourceStr, destStr);

		// Test copyWithBounds
		final List<Integer> srcInt = Arrays.asList(100, 200, 300);
		final List<Number> dstNum = new ArrayList<>();
		copyWithBounds(srcInt, dstNum);
		System.out.println("dstNum: " + dstNum);
	}
}
