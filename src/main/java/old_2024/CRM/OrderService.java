package old_2024.CRM;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OrderService {
	public static List<Product> getAllOrderedProducts(final List<Customer> customers) {
		// Zamienia Order na Stream<Product>
		return customers.stream()
				.map(Customer::getOrder) // Zamienia Customer na Optional<Order>
				.flatMap(Optional::stream) // Spłaszcza Optional<Order> -> Order (usuwa Optional.empty())
				.flatMap(order -> order.getProducts().stream()) // Spłaszcza Stream<Stream<Product>> -> Stream<Product>
				.collect(Collectors.toList()); // Konwertuje na List<Product>
	}
}
