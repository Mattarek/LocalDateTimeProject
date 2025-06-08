package current_2025.SOLID.ProjektKoncowy;

import java.math.BigDecimal;

// --- O: Open/Closed Principle (OCP) ---
// Rabaty można dodawać bez modyfikowania istniejącego kodu
public class PercentageDiscount implements DiscountStrategy {
	private final BigDecimal percentage;

	public PercentageDiscount(final BigDecimal percentage) {
		this.percentage = percentage;
	}

	public BigDecimal applyDiscount(final BigDecimal total) {
		return total.subtract(total.multiply(percentage));
	}
}
