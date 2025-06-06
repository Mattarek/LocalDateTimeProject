package old_2024.genericsExample;

public class Name<T> {
	private T name;

	public Name(final T element) {
		name = element;
	}

	public static <T extends Number> void showNumber(final T num) {
		System.out.println("Liczba: " + num);
	}

	public T getName() {
		return name;
	}

	public void setName(final T name) {
		this.name = name;
	}
}
