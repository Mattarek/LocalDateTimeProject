package megaK.genericClass;

import java.util.function.Predicate;

public class FilteringBag<T, U extends Predicate<T>, V extends Predicate<T>> {
	private final U filterOne;
	private final V filterTwo;
	private T element;

	public FilteringBag(final U filterOne, final V filterTwo) {
		this.filterOne = filterOne;
		this.filterTwo = filterTwo;
	}

	public void pack(final T element) {
		if (filterOne.test(element) && filterTwo.test(element)) {
			this.element = element;
		} else {
			throw new RuntimeException("No way mate!");
		}
	}

	public T empty() {
		final T element = this.element;
		this.element = null;
		return element;
	}
}
