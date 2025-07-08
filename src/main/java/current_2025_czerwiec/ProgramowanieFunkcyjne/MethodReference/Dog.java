package current_2025_czerwiec.ProgramowanieFunkcyjne.MethodReference;

public class Dog {
	private final String name;

	public Dog(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"name='" + name + '\'' +
				'}';
	}
}
