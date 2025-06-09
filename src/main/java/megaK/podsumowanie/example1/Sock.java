package megaK.podsumowanie.example1;

import java.util.Collection;

public class Sock<T extends Collection<U>, U> {
	private T item;

	public boolean put(final T element) {
		if (item == null || !item.equals(element)) {
			item = element;
			return true;
		}
		return false;
	}

	public T getItem() {
		return item;
	}
}
