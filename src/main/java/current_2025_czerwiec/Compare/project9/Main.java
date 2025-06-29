package current_2025_czerwiec.Compare.project9;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(final String[] args) {
		final Comparator<Product> byPriceThenName =
				Comparator.comparingDouble(Product::getPrice).thenComparing(Product::getName);

		final Map<Product, Integer> warehouse = new TreeMap<>(byPriceThenName);

		warehouse.put(new Product("Mleko", 3.5), 10);
		warehouse.put(new Product("Mleko", 2.9), 15);
		warehouse.put(new Product("Mleko", 3.5), 5);
		warehouse.put(new Product("Mleko", 1.99), 50);

		warehouse.forEach((p, qty) -> {
			System.out.println(p + " | Ilość: " + qty);
		});
	}
}
