package old_2024.genericsExample;

public class IntegerStorage extends Storage<Integer> {
	public IntegerStorage(final Integer value) {
		super(value);
	}

	@Override
	public void printInfo() {
		System.out.println("Liczba: " + value);
	}
}
