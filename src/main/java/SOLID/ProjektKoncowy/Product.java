package SOLID.ProjektKoncowy;

import java.math.BigDecimal;

// --- S: Single Responsibility Principle (SRP) ---
// Tylko jedną odpowiedzialność
public class Product {
	private final String name;
	private final BigDecimal price;

	public Product(final String name, final BigDecimal price) {
		this.name = name;
		this.price = price;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}
}
