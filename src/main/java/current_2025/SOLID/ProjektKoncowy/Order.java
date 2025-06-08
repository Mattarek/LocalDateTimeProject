package current_2025.SOLID.ProjektKoncowy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// --- S: Single Responsibility Principle (SRP) ---
// Tylko jedną odpowiedzialność
public class Order {
	private final List<Product> products = new ArrayList<>();

	public void addProduct(final Product product) {
		products.add(product);
	}

	public List<Product> getProducts() {
		return Collections.unmodifiableList(products);
	}

	public BigDecimal getTotal() {
		return products.stream()
				.map(Product::getPrice)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}
}
