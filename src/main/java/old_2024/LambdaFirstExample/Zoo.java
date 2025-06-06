package old_2024.LambdaFirstExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Zoo {
	private final List<Animal> animals;

	public Zoo() {
		animals = new ArrayList<>();
	}

	public void addAnimal(final Animal animal) {
		animals.add(animal);
	}

	// Predicate: Filtrowanie zwierząt dorosłych
	public void showAdultAnimals() {
		System.out.println("Adult Animals: ");
		animals.stream()
				.filter(Animal.isAdult)
				.forEach(System.out::println);
	}

	// Function: Przekształcenie na zwierzęta o nazwach w dużych literach
	public void showAnimalNamesUpperCase() {
		final Function<Animal, String> nameUpperCase = animal -> animal.getName().toUpperCase();
		System.out.println("\nAnimal Names in Uppercase: ");
		animals.stream()
				.map(nameUpperCase)
				.forEach(System.out::println);
	}

	// Consumer: Wywołanie na każdym zwierzęciu akcji (np. dźwięk)
	public void makeAllAnimalsSound() {
		final Consumer<Animal> makeSound = Animal::makeSound;
		System.out.println("\nAll animals are making a sound: ");
		animals.forEach(makeSound);
	}

	// Supplier: Dajemy zwierzę losowe z listy
	public void showRandomAnimal() {
		final Supplier<Animal> randomAnimal = () -> animals.get(new Random().nextInt(animals.size()));
		System.out.println("\nRandom Animal: ");
		System.out.println(randomAnimal.get());
	}

	// Comparator: Sortowanie zwierząt po wieku
	public void showAnimalsSortedByAge() {
		final Comparator<Animal> ageComparator = Comparator.comparingInt(Animal::getAge);
		System.out.println("\nAnimals sorted by age: ");
		animals.stream()
				.sorted(ageComparator)
				.forEach(System.out::println);
	}
}