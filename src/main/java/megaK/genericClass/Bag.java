package megaK.genericClass;

public class Bag<T> {
	private T element;

	public void pack(final T element) {
		this.element = element;
	}

	public T empty() {
		final T element = this.element;
		this.element = null;
		return element;
	}

	@Override
	public String
	toString() {
		return "Bag{" +
				"element=" + element +
				'}';
	}
}
