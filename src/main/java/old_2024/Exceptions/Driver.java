package old_2024.Exceptions;

public class Driver {
	private int age;

	public Driver(final int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(final int age) throws RuntimeException {
		if (age < 18) {
		}
		this.age = age;
	}
}
