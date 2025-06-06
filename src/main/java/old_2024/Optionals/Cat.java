package old_2024.Optionals;

public class Cat {
	private final String name;
	private final int age;

	public Cat(final String name, final int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
