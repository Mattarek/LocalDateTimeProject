package SOLID.D.Dobre;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private final List<Product> products = new ArrayList<>();

	public void addProducts(final Product product) {
		products.add(product);
	}
}
