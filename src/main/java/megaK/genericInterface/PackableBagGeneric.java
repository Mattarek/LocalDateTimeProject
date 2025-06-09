package megaK.genericInterface;

public class PackableBagGeneric<T> implements Packable<T> {

	private T[] array;

	@Override
	public void pack(final T element) {

	}

	@Override
	public T empty() {
		return null;
	}
}
