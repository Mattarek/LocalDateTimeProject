package current_2025_czerwiec.Compare.project9;

public class Product {
	private final String name;
	private final double price;

	public Product(final String name, final double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return name + " - " + price;
	}
}
