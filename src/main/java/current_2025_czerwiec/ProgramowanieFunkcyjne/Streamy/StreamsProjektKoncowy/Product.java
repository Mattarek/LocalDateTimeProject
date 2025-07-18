package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.StreamsProjektKoncowy;

public class Product implements Comparable<Product> {
	private final String id;
	private final String name;
	private final Category category;
	private final Money price;

	public Product(final String id, final String name, final Category category, final Money price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public Money getPrice() {
		return price;
	}

	public Category getCategory() {
		return category;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Product{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", category=" + category +
				", price=" + price +
				'}';
	}

	// konstruktory, gettery itp
	@Override
	public int compareTo(final Product o) {
		final int thisNumber = Integer.parseInt(id.substring(7));
		final int otherNumber = Integer.parseInt(o.id.substring(7));
		return thisNumber - otherNumber;
	}

	public enum Category {
		HOBBY,
		CLOTHES,
		GARDEN,
		AUTOMOTIVE
	}
}