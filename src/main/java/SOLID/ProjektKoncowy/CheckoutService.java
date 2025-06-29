package SOLID.ProjektKoncowy;

import java.math.BigDecimal;

public class CheckoutService {
	private final PaymentMethod paymentMethod;
	private final DiscountStrategy discountStrategy;

	public CheckoutService(final PaymentMethod paymentMethod, final DiscountStrategy discountStrategy) {
		this.paymentMethod = paymentMethod;
		this.discountStrategy = discountStrategy;
	}

	public void checkout(final Order order) {
		final BigDecimal total = order.getTotal();
		final BigDecimal discountedTotal = discountStrategy.applyDiscount(total);
		paymentMethod.pay(discountedTotal);
	}
}
