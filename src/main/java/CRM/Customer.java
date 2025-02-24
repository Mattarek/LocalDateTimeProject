package CRM;

import java.util.Optional;

public class Customer {
	private final String name;
	private final Optional<Order> order;

	public Customer(final String name, final Optional<Order> order) {
		this.name = name;
		this.order = order;
	}

	public Optional<Order> getOrder() {
		return order;
	}

	public String getName() {
		return name;
	}
}
