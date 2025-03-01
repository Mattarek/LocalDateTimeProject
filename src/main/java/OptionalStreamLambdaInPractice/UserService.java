package OptionalStreamLambdaInPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserService {
	private final List<User> users;

	public UserService(final List<User> users) {
		this.users = users;
	}

	public static void main(final String[] args) {
		final List<User> users = Arrays.asList(
				new User(1, "Marcin", 30),
				new User(2, "Agnieszka", 25),
				new User(3, "Darek", 35),
				new User(4, "Andrzej", 29),
				new User(5, "Łukasz", 37)
		);

		final UserService userService = new UserService(users);

		// Pobieranie uzytkownika po ID
		final Optional<User> user = userService.getOldestUser();
		user.ifPresent(System.out::println);

		// Filtrowanie użytkowników staszych niz 28
		System.out.println("Użytkownicy starsi niz 28 lat:");
		userService.getUsersOlderThan(28).forEach(System.out::println);

		// Sredni wiek użytkowników
		System.out.println("Średni wiek: " + userService.getAverageAge());

		// Najstarszy uzytkownik
		userService.getOldestUser().ifPresent(u -> System.out.println("Najstarszy użytkownik: " + u));
	}

	// Pobieranie uzytkownika po ID z Optionalem
	public Optional<User> getUserById(final int id) {
		return users.stream().filter(user -> user.id() == id).findFirst();
	}

	// Filtrowanie użytkowników według minimalnego wieku
	public List<User> getUsersOlderThan(final int minAge) {
		return users.stream().filter(user -> user.age() > minAge).collect(Collectors.toList());
	}

	// Obliczanie średniego wieku użytkowników
	public double getAverageAge() {
		return users.stream().mapToInt(User::age).average().orElse(0.0);
	}

	// Znalezienie najstarszego użytkownika
	public Optional<User> getOldestUser() {
		return users.stream().max(Comparator.comparingInt(User::age));
	}
}
