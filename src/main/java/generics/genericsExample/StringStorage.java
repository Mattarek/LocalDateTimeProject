package generics.genericsExample;

public class StringStorage extends Storage<String> {
	public StringStorage(final String value) {
		super(value);
	}

	@Override
	public void printInfo() {
		System.out.println("Value: " + value);
	}
}
