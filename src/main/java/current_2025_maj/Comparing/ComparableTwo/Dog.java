package current_2025_maj.Comparing.ComparableTwo;

public class Dog implements Comparable<Dog> {
	private final String name;
	private final Integer id;

	public Dog(final Integer id, final String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(final Dog o) {
		final int result = o.name.compareTo(name);
		if (result != 0) {
			return result;
		}
		return o.id - id;
	}

	@Override
	public String toString() {
		return "Dog: " +
				"name=" + name + '_' + id +
				" }";
	}
}
