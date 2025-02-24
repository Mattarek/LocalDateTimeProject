package CRM;

import java.util.List;
import java.util.Optional;

public class Main {
	public static void main(final String[] args) {
		// Produkty
		final Product laptop = new Product("Laptop");
		final Product phone = new Product("Smartphone");
		final Product tablet = new Product("Tablet");

		// Klienci i ich zamówienia
		final Customer customer1 = new Customer("Alice", Optional.of(new Order(List.of(laptop, phone))));
		final Customer customer2 = new Customer("Bob", Optional.empty()); // Bob nie ma zamówienia
		final Customer customer3 = new Customer("Charlie", Optional.of(new Order(List.of(tablet))));

		// Lista klientów
		final List<Customer> customers = List.of(customer1, customer2, customer3);

		// Pobieramy wszystkie zamówione produkty
		final List<Product> orderedProducts = OrderService.getAllOrderedProducts(customers);

		// Wyświetlamy raport zamówień
		System.out.println("📦 Lista zamówionych produktów: " + orderedProducts);
	}
}
