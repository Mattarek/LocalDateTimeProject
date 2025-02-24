package CRM;

public class Product {
	private final String name;

	public Product(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Product{" +
				"name='" + name + '\'' +
				'}';
	}
}
