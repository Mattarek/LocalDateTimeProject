package megaK.DesignPattarens.AbstractFactory;

public class FactoryProvider {
	// Fabryka fabryk(Fabryka produkująca fabryki)

	public static AbstractFactory<?> getFactory(final String whatFactory) {
		switch (whatFactory) {
			case "Pizza":
				return new PizzaFactory();
			case "Car":
				return new CarFactory();
			default:
				throw new RuntimeException("I'm sorry! We only sell pizzas or cars.");
		}
	}
}
