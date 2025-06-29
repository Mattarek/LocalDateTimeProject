package SOLID.ProjektKoncowy;

import java.math.BigDecimal;

// --- O: Open/Closed Principle (OCP) ---
// Rabaty można dodawać bez modyfikowania istniejącego kodu
public interface DiscountStrategy {
	BigDecimal applyDiscount(BigDecimal total);
}
