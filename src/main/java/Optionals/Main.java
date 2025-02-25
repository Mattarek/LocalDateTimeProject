package Optionals;

import java.util.Optional;

class User {
	private Optional<String> email;

	public Optional<String> getEmail() {
		return email;
	}
}

public class Main {
	public static void main(final String[] args) {
		final Optional<String> empty = Optional.empty();
		final Optional<String> name = Optional.of("Marcin");
		final Optional<String> nullableName = Optional.ofNullable(null);

		// Spradzamy wartości
		final boolean isPresent = name.isPresent(); // true
		final boolean isEmpty = name.isEmpty(); // false

		// Pobieranie wartości
		final String value = name.get(); // "Marcin" ale jeśli jest pusta, to wyrzuci wyjątek
		final String orElse = nullableName.orElse("Domyślna wartość"); // Domyślna nazwa
		final String orElseGet = nullableName.orElseGet(() -> "Domyślna wartość");

		// Obsługa braku wartości
		name.ifPresent(System.out::println);
		nullableName.ifPresentOrElse(System.out::println, () -> System.out.println("Brak wartości"));

		// Transformacja wartości
		final Optional<Integer> length = name.map(String::length);
		final Optional<String> upperName = name.map(String::toUpperCase);

		// Łańcuchowanie operacji
		final String result = nullableName
				.map(String::toUpperCase)
				.orElse("Brak danych");

		// Unikanie null w obiektach zagbieżdzonych
		final Optional<User> user = Optional.of(new User());
		final String Email = user.flatMap(User::getEmail).orElse("Brak maila");
	}
}
