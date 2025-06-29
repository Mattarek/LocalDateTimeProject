package current_2025_maj.Coffee;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
	private final int orderId;
	private final List<Coffee> items = new ArrayList<>();
	private OrderStatus status = OrderStatus.NEW;

	public Order(final int orderId) {
		this.orderId = orderId;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(final OrderStatus status) {
		this.status = status;
	}

	public void addCoffee(final Coffee coffee) {
		items.add(coffee);
	}

	public double calculateTotal() {
		return items.stream()
				.mapToDouble(Coffee::calculatePrice)
				.sum();
	}

	public int getOrderId() {
		return orderId;
	}

	public List<Coffee> getCoffee() {
		return items;
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final Order order)) {
			return false;
		}
		return orderId == order.orderId && Objects.equals(items, order.items);
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderId, items);
	}

	@Override
	public String toString() {
		return STR."Order #\{orderId}: \{items} | Total: \{calculateTotal()} zł";
	}
}
