package current_2025.Coffee;

public enum CoffeeType {
	ESPRESSO(6.0),
	LATTE(8.0),
	CAPPUCCION(7.5),
	AMERICANO(7.0);

	private final double basePrice;

	CoffeeType(final double basePrice) {
		this.basePrice = basePrice;
	}

	public double getBasePrice() {
		return basePrice;
	}
}
