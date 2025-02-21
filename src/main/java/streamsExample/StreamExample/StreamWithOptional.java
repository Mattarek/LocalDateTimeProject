package streamsExample.StreamExample;

import java.util.List;
import java.util.Optional;

public class StreamWithOptional {
	public static void main(final String[] args) {
		//==========================================================================================================
		final List<String> namesFilter = List.of("Anna", "Kamil", "Ola", "Kasia");
		final Optional<String> firstLongName = namesFilter.stream().filter(name -> name.length() > 4).findFirst();
		firstLongName.ifPresent(name -> System.out.println("Pierwsze imię dłuższe niż 4 litery: " + name));

		//==========================================================================================================
		final List<Integer> numbers = List.of(10, 3, 25, 8, 1);
		final Optional<Integer> min = numbers.stream().min(Integer::compareTo);
		final Optional<Integer> max = numbers.stream().max(Integer::compareTo);

		min.ifPresent(value -> System.out.println("Najmniejsza liczba: " + value));
		max.ifPresent(value -> System.out.println("Największe liczba: " + value));

		//==========================================================================================================
		//		Metoda map() pozwala na transformację zawartości Optional bez sprawdzania, czy jest pusty.
		final List<String> namesMapOptional = List.of("Anna", "Kamil", "Ola", "Kasia");
		final Optional<String> firstName = namesMapOptional.stream().findFirst();
		final Optional<Integer> nameLength = firstName.map(String::length);
		nameLength.ifPresent(length -> System.out.println("Długość pierwszego imienia: " + length));

		//==========================================================================================================
		//		📌 4. flatMap() – Gdy Optional zwraca inny Optional
		final List<String> names = List.of("Anna", "Kamil", "Ola", "Kasia");
		final Optional<String> firstNameMap = names.stream().findFirst();
		final Optional<Integer> length = firstNameMap.flatMap(name -> Optional.of(name.length()));
		length.ifPresent(len -> System.out.println("Długość pierwszego imienia: " + len));

		//==========================================================================================================
		final List<String> emptyList = List.of();

		final String nameOne = emptyList.stream().findFirst().orElse("Brak imion");
		System.out.println(nameOne);

		final String nameTwo = emptyList.stream().findFirst().orElseGet(() -> "Brak imion z funkcją");
		System.out.println(nameTwo);

		//		final String nameThree = emptyList.stream().findFirst().orElseThrow(() -> new RuntimeException("Lista jest pusta!"));
		//		System.out.println(nameThree);

		//==========================================================================================================
		final List<String> namesSix = List.of("Anna", "Kamil", "Ola", "Kasia");
		final Optional<String> firstNameSix = namesSix.stream().findFirst();
		final Optional<String> longName = firstNameSix.filter(name -> name.length() > 4);
		System.out.println(longName.orElse("Brak drugiego imienia"));
	}
}
