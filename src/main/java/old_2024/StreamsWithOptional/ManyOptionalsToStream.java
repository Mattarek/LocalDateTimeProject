package old_2024.StreamsWithOptional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class User {
	private final String name;

	public User(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class ManyOptionalsToStream {
	public static void main(final String[] args) {
		final Optional<String> opt1 = Optional.of("A");
		final Optional<String> opt2 = Optional.empty();
		final Optional<String> opt3 = Optional.of("B");

		final List<String> values = Stream.of(opt1, opt2, opt3)
				.flatMap(Optional::stream)
				.collect(Collectors.toList());
		System.out.println(values); // [A, B]

		//=====================================================================================================
		final Optional<User> userOne = Optional.of(new User("Alice"));
		final Optional<User> userTwo = Optional.empty();
		final Optional<User> userThree = Optional.of(new User("Bob"));

		// Tworzymy listę nazw użytkowników z dostępnych Optionali
		final List<String> usernames =
				Stream.of(userOne, userTwo, userThree).flatMap(Optional::stream).map(User::getName).collect(Collectors.toList());
		System.out.println(usernames); // [Alice, Bob]
	}
}
