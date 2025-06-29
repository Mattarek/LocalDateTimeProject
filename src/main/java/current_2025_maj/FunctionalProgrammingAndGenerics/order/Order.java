package current_2025_maj.FunctionalProgrammingAndGenerics.order;

import current_2025_maj.FunctionalProgrammingAndGenerics.model.Product;

import java.time.LocalDate;

public class Order<T extends Product> {
	private final T product;
	private final int quantity;
	private final LocalDate orderDate;

	public Order(final T product, final int quantity, final LocalDate orderDate) {
		this.product = product;
		this.quantity = quantity;
		this.orderDate = orderDate;
	}

	public T getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public double totalPrice() {
		return product.getPrice() * quantity;
	}
}
