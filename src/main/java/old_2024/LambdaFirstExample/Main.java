package old_2024.LambdaFirstExample;

public class Main {
	public static void main(final String[] args) {

		// Tworzymy zoo
		final Zoo zoo = new Zoo();

		// Dodajemy zwierzęta do zoo
		zoo.addAnimal(new Animal("Lion", "Panthera leo", 7));
		zoo.addAnimal(new Animal("Elephant", "Loxodonta", 12));
		zoo.addAnimal(new Animal("Giraffe", "Giraffa camelopardalis", 4));
		zoo.addAnimal(new Animal("Tiger", "Panthera tigris", 6));

		// 1. Wyświetlamy dorosłe zwierzęta
		zoo.showAdultAnimals();

		// 2. Wyświetlamy nazwy zwierząt w wielkich literach
		zoo.showAnimalNamesUpperCase();

		// 3. Każde zwierzę wydaje dźwięk
		zoo.makeAllAnimalsSound();

		// 4. Losowe zwierzę z zoo
		zoo.showRandomAnimal();

		// 5. Sortujemy zwierzęta po wieku
		zoo.showAnimalsSortedByAge();
	}
}
