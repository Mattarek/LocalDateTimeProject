package old_2024.LambdaInPractice;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {
	public static void main(final String[] args) {
		// Wypisanie liczby do konsoli
		final Consumer<Integer> printNumber = num -> System.out.println("Liczba: " + num);
		printNumber.accept(5);

		// Wypiasnie elementow listy
		// list -> list.forEach(System.out::println); to skrót od: element -> System.out.println(element)
		final Consumer<List<String>> printList = list -> list.forEach(System.out::println);
		printList.accept(List.of("Krakow", "Warszaaw", "Rzeszów"));

		// Wypisanie długości stringa
		final Consumer<String> stringLength = str -> System.out.println(str.length());
		stringLength.accept("dlugoscStringaDoSprawdzenia");

		// Wypisanie tekstu dużymi literami
		final Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
		printUpperCase.accept("Java string test");

		// Zwiększenie liczby o 10 i wypisanie
		final Consumer<Integer> integerUpper = num -> System.out.println(num + 10);
		integerUpper.accept(15);
	}
}
