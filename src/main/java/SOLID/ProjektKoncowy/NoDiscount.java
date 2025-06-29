package SOLID.ProjektKoncowy;

import java.math.BigDecimal;

// --- O: Open/Closed Principle (OCP) ---
// Rabaty można dodawać bez modyfikowania istniejącego kodu
public class NoDiscount implements DiscountStrategy {
	public BigDecimal applyDiscount(final BigDecimal total) {
		return total;
	}
}
