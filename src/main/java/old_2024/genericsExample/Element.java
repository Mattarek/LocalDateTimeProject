package old_2024.genericsExample;

public class Element<T> {
	private T element;

	public Element(final T element) {
		this.element = element;
	}

	public static <T> void showElement(final T element) {
		System.out.println(element);
	}

	public T getElement() {
		return element;
	}

	public void setElement(final T element) {
		this.element = element;
	}

	@Override
	public String toString() {
		return "Element{" +
				"element=" + element +
				'}';
	}
}
