package old_2024.Optionals;

import java.util.Optional;

public class OptionalTutorial {
	public static void main(final String[] args) {
		final Optional<Cat> myCat = findCatByName("Fred");
		myCat.ifPresent(cat -> System.out.println(cat.getName()));
		myCat.map(Cat::getAge).orElse(0);
		System.out.println(myCat.get().getAge());

		System.out.println(0);
	}

	private static Optional<Cat> findCatByName(final String name) {
		return Optional.ofNullable(new Cat(name, 3));
	}
}
