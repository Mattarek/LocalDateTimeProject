package SOLID.ProjektKoncowy;

import java.math.BigDecimal;

// --- L: Liskov Substitution Principle (LSP) ---
// Wszystkie implementacje DiscountStrategy i PaymentMethod działają zamiennie

// --- I: Interface Segregation Principle (ISP) ---
// Brak przerośniętych interfejsów, każdy ma tylko potrzebne metody

// --- D: Dependency Inversion Principle (DIP) ---
// CheckoutService zależy od abstrakcji: PaymentMethod i DiscountStrategy
public interface PaymentMethod {
	void pay(BigDecimal amount);
}
