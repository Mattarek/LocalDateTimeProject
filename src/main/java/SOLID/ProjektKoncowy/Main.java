package SOLID.ProjektKoncowy;

import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class Main {
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(Main.class);

	public static void main(final String[] args) {
		final Logger logger = new Logger();
		final Order order = new Order();
		order.addProduct(new Product("Coffee", new BigDecimal("10.99")));
		order.addProduct(new Product("Book", new BigDecimal("25.50")));

		final PaymentMethod paymentMethod = new PaypalPayment();
		final DiscountStrategy discount = new PercentageDiscount(new BigDecimal("0.10"));

		final CheckoutService checkoutService = new CheckoutService(paymentMethod, discount);
		logger.log("Zamówienie zawiera " + order.getProducts().size() + "produkty.");
		logger.log("Suma przed zniżką: " + order.getTotal());

		checkoutService.checkout(order);
	}
}

// Projekt spełnia:
// - SRP: Product, Order, Logger, CheckoutService – każda klasa ma własną odpowiedzialność
// - OCP: DiscountStrategy i PaymentMethod mogą być rozszerzane
// - LSP: Wszystkie implementacje strategii i płatności są wymienne
// - ISP: Interfejsy są małe, konkretne
// - DIP: CheckoutService używa interfejsów, nie konkretnych klas
// - KISS: Kod jest prosty, bez zbędnej logiki
// - YAGNI: Brak implementacji funkcji, które nie są teraz potrzebne (np. wysyłki, magazynów itp.)
