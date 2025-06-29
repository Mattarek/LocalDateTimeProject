package SOLID.ProjektKoncowy;

import java.math.BigDecimal;

public class CreditCardPayment implements PaymentMethod {
	public void pay(final BigDecimal amount) {
		System.out.println("Paid " + amount + " using credit card.");
	}
}
