package megaK.PodsumowanieWildcards.zadania;

public class Tuple<E1, E2> {
	private E1 key;
	private E2 value;

	public Tuple(final E1 key, final E2 value) {
		this.key = key;
		this.value = value;
	}

	public E1 getKey() {
		return key;
	}

	public void setKey(final E1 key) {
		this.key = key;
	}

	public E2 getValue() {
		return value;
	}

	public void setValue(final E2 value) {
		this.value = value;
	}
}
