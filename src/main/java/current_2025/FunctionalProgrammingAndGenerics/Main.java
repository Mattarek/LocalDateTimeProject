package current_2025.FunctionalProgrammingAndGenerics;

import current_2025.FunctionalProgrammingAndGenerics.model.Book;
import current_2025.FunctionalProgrammingAndGenerics.order.Order;
import current_2025.FunctionalProgrammingAndGenerics.order.OrderProcessor;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(final String[] args) {
		final List<Order<Book>> orders = Arrays.asList(
				new Order<>(new Book("Effective Java", 120), 1, LocalDate.now()),
				new Order<>(new Book("Clean Code", 95), 2, LocalDate.now()),
				new Order<>(new Book("Java 17", 150), 1, LocalDate.now())
		);

		final OrderProcessor<Order<Book>> processor = new OrderProcessor<>();

		// 1. Filtrowanie
		final List<Order<Book>> expensive = processor.filter(orders, order -> order.totalPrice() > 100);

		// 2. Transformacja: mapowanie do nazw książek
		final List<String> names = processor.transform(orders, order -> order.getProduct().getTitle());

		// 3. Akcja: wypisanie wszystkich zamówień
		processor.forEach(orders,
				order -> System.out.println("Zamówienie: " + order.getProduct().getTitle() +
						", cena: " + order.totalPrice())
		);
	}
}
