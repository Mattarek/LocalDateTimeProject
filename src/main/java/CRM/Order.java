package CRM;

import java.util.List;

public class Order {
	private final List<Product> products;

	public Order(final List<Product> products) {
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}
}
