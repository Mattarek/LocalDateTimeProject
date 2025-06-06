package old_2024.AnonimClass;

public class AnonimClass {
	public static void main(final String[] args) {

		// Anonymous class
		final Animal animal = new Animal() {
			@Override
			void makeSound() {
				System.out.println("Woof woof!");
			}
		};
		animal.makeSound(); // Woof woof!
		animal.eat(); // Eating...

		// Anonymous interface
		final Greeting greeting = new Greeting() {
			@Override
			public void sayHello() {
				System.out.println("Hello, world!");
			}
		};

		greeting.sayHello(); // Hello, world!
	}
}
