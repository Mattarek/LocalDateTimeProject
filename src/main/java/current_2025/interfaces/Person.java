package current_2025.interfaces;

public class Person {
	private final String name;

	public Person(final String name) {
		this.name = name;
	}

	public static void greet(final Person p) {
		p.sayHello();
	}

	public static void main(final String[] args) {
		final Person person = new Person("Marcin");
		greet(person);
	}

	public void sayHello() {
		System.out.println("Cześć, mam na imie: " + name);
	}
}
