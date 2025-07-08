package current_2025_czerwiec.ProgramowanieFunkcyjne.MethodReference;

import old_2024.staticInheritence.A.A;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
	// =======================================================================
	// Przykład nr.1
	//	public static void main(final String[] args) {
	//		final MilkProducer producer = Main::someMilkReferenceOne;
	//		final MilkConsumer consumer = Main::someMilkReferenceTwo;
	//
	//		System.out.println(producer.produce());
	//		System.out.println(consumer.consume("somethingToConsume"));
	//	}
	//
	//	public static String someMilkReferenceOne() {
	//		return "someMilkFromMethod";
	//	}
	//
	//	public static String someMilkReferenceTwo(final String arg1) {
	//		return "Calling some method" + arg1;
	//	}
	//
	//	@FunctionalInterface
	//	interface MilkProducer {
	//		String produce();
	//	}
	//
	//	@FunctionalInterface
	//	interface MilkConsumer {
	//		String consume(String toConsume);
	//	}

	// =======================================================================
	// Przykład nr.2
	public static void main(final String[] args) {
		final Main main = new Main();
		main.run();
	}

	private void run() {
		//		final DogPrinter dogPrinter = new DogPrinter();
		//
		//		final String someDog = Optional.of(new Dog("Burek"))
		//				.map(Dog::getName)
		//				.orElse("Another Dog Name");
		//		System.out.println(someDog);
		//
		//		Optional.of(new Dog("Next Burek"))
		//				.ifPresent(dogPrinter::printDoggy);

		final List<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog("Burek"));
		dogs.add(new Dog("Arek"));
		dogs.add(new Dog("Curel"));
		dogs.add(new Dog("Starek"));

		Optional.of(new Dog("Burkę")).ifPresent(this::printDoggy);
	}

	private void printDoggy(final Dog dog) {
		System.out.println("Static dog Printing");
		System.out.println(dog);
	}
}
