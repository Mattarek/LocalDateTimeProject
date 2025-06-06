package current_2025.Coffee;

import java.util.HashMap;
import java.util.Map;

public class OrderManager {
	private final Map<Integer, Order> orders = new HashMap<>();
	private int nextOrderId = 1;

	public Order createOrder() {
		final Order order = new Order(nextOrderId++);
		orders.put(order.getOrderId(), order);
		return order;
	}

	public void printAllOrders() {
		orders.values().forEach(System.out::println);
	}
}
