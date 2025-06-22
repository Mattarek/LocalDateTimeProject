package current_2025.FunctionalProgrammingAndGenerics.model;

public class Book implements Product {
	private final String title;
	private final double price;

	public Book(final String title, final double price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}
}
