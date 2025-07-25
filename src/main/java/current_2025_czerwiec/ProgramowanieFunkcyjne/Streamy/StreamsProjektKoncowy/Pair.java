package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.StreamsProjektKoncowy;

public class Pair<T, V> {
	private final T u;
	private final V v;

	public Pair(final T u, final V v) {
		this.u = u;
		this.v = v;
	}

	public T getU() {
		return u;
	}

	public V getV() {
		return v;
	}

	@Override
	public String toString() {
		return "Pair{" +
				"u=" + u +
				", v=" + v +
				'}';
	}
}
