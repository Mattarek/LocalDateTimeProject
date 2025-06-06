package old_2024.Reflection;

public class Person {
	private final String name;
	private final int age;

	public Person(final String name, final int age) {
		this.name = name;
		this.age = age;
	}

	public void introduce() {
		System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
	}
}
