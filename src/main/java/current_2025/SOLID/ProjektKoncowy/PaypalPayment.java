package current_2025.SOLID.ProjektKoncowy;

import java.math.BigDecimal;

public class PaypalPayment implements PaymentMethod {
	public void pay(final BigDecimal amount) {
		System.out.println("Paid " + amount + " using PayPal.");
	}
}
