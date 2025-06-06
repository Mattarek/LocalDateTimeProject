package current_2025.Coffee;

public enum PaymentMethod {
	CARD {
		public void processPayment(final Order order) throws EmptyOrderException {
			System.out.println("Płacenie kartą...");
			if (order.getCoffee().isEmpty()) {
				throw new EmptyOrderException("Zamówienie jest puste!");
			}
			System.out.println("Zamówienie opłacone kartą: " + order.getOrderId());
		}
	},
	CASH {
		public void processPayment(final Order order) throws EmptyOrderException {
			System.out.println("Płatność gotówką...");
			if (order.getCoffee().isEmpty()) {
				throw new EmptyOrderException("Zamówienie jest puste!");
			}
			System.out.println("Zamówienie opłacone gotówką: " + order.getOrderId());
		}
	};

	public abstract void processPayment(Order order) throws EmptyOrderException;
}
