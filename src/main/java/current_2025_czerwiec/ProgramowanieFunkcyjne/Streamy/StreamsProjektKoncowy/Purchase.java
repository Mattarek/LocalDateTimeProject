package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.StreamsProjektKoncowy;

import java.time.LocalDate;

public class Purchase {
	private final Client buyer;
	private final Product product;
	private final long quantity;
	private final Delivery delivery;
	private final Payment payment;
	private final LocalDate when;
	private final Status status = Status.PAID;

	public Purchase(final Client buyer, final Product product, final long quantity, final Delivery delivery, final Payment payment, final LocalDate when) {
		this.buyer = buyer;
		this.product = product;
		this.quantity = quantity;
		this.delivery = delivery;
		this.payment = payment;
		this.when = when;
	}

	public Client getBuyer() {
		return buyer;
	}

	public Status getStatus() {
		return status;
	}

	public LocalDate getWhen() {
		return when;
	}

	public Payment getPayment() {
		return payment;
	}

	public Delivery getDelivery() {
		return delivery;
	}

	public long getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

	@Override
	public String toString() {
		return "Purchase{" +
				"buyer=" + buyer +
				", product=" + product +
				", quantity=" + quantity +
				", delivery=" + delivery +
				", payment=" + payment +
				", when=" + when +
				", status=" + status +
				'}';
	}

	// konstruktory, gettery itp
	public enum Delivery {
		IN_POST,
		UPS,
		DHL
	}

	public enum Payment {
		CASH,
		BLIK,
		CREDIT_CARD
	}

	public enum Status {
		PAID,
		SENT,
		DONE
	}
}
