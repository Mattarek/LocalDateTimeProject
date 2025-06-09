package megaK.genericInterface;

public interface Packable<T> {
	T empty();

	void pack(T element);
}
