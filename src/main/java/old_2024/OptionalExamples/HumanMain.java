package old_2024.OptionalExamples;

import java.util.Optional;

public class HumanMain {
	public static void main(final String[] args) {
		//		final Optional<Human> human = retrieveHuman("Adama"); // Optional[Human{name='Adama'}]
		final Optional<Human> human = retrieveHuman("Adama");
		//		final Optional<String> filteredNameOpt = human.map(Human::getName).filter(f -> f.length() > 4);
		//		System.out.println(filteredNameOpt);
		//		filteredNameOpt.ifPresent(n -> System.out.println(n));

		//============================================================================
		// Usuwamy jedno zagniezdzenie optionala, dzięki flatMap z Optional<Optional<String>> robimy Optional<String>

		// 	public Optional<String> getName() {
		//		return Optional.of(name);
		//	}

		//=============================================================================
		final Human humanOptional =
				human.or(() -> Optional.empty()).or(() -> Optional.ofNullable(new Human("Edyta"))).get();
		System.out.println(humanOptional);
		//=============================================================================
		//		final Optional<String> filteredNameOpt =
		//				human.flatMap(h -> h.getName()).filter(f -> f.length() > 4);
		//		System.out.println(filteredNameOpt);
		//		filteredNameOpt.ifPresent(n -> System.out.println(n));
		//=============================================================================
		//human.map(h -> h.getName()).filter(f -> f.length() > 4).ifPresent(n -> System.out.println(n));

		//=============================================================================
		//		System.out.println(name.map(n -> n.toUpperCase())); // Optional[ADAMA]
		//		System.out.println(name);

		//=============================================================================
		//		System.out.println(human.orElseGet(() -> {
		//			System.out.println("It is from orElseGet");
		//			return new Human("Nadia");
		//		}));
		//
		//		System.out.println(human.orElse(nadiaMethod()));
		//		if (human.isPresent()) {
		//			human.get();
		//		}
		//		if (human.isEmpty()) {
		//			human.orElse(new Human("Nadia"));
		//		}

		//=============================================================================
		//System.out.println(human.orElse(new Human("Nadia")));

	}

	private static Human nadiaMethod() {
		System.out.println("It is from orElse");
		return new Human("Nadia");
	}

	public static Optional<Human> retrieveHuman(final String name) {
		// jeśli nasz string nie kończy się na a, zwróc nulla
		return name.endsWith("a") ? Optional.of(new Human(name)) : Optional.empty();
	}
}
