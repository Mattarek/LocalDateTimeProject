package generics.genericsExample;

public abstract class Storage<T> {
	protected final T value;

	public Storage(final T value) {
		this.value = value;
	}

	public abstract void printInfo();
}
