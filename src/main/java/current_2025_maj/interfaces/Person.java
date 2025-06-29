package current_2025_maj.interfaces;

public class Person {
	private final String name;

	public Person(final String name) {
		this.name = name;
	}

	public static void greet(final Person p) {
		p.sayHello();
	}

	public static void greet(final Person p, final String text) {
		p.sayHello();
		System.out.println(text);
	}

	public static void main(final String[] args) {
		final Person person = new Person("Marcin");
		greet(person);
		greet(person, "test");
	}

	public void sayHello() {
		System.out.println("Cześć, mam na imie: " + name);
	}
}
