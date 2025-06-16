package megaK.DesignPattarens.AbstractFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class FactoryProvider {
	// Fabryka fabryk(Fabryka produkująca fabryki)
	// Po Java 8
	private static final Map<String, Supplier<AbstractFactory<?>>> FACTORIES_MAP = new HashMap<>();

	static {
		FACTORIES_MAP.put("Pizza", PizzaFactory::new);
		FACTORIES_MAP.put("Car", CarFactory::new);
	}

	public static AbstractFactory<?> getFactory(final String whatFactory) {
		// Po Java 8
		return Optional.ofNullable(FACTORIES_MAP.get(whatFactory))
				.map(Supplier::get)
				.orElseThrow(() -> new RuntimeException("I'm sorry, we only produce Pizzas od Cars!"));

		// Przed Java 8
		//		switch (whatFactory) {
		//			case "Pizza":
		//				return new PizzaFactory();
		//			case "Car":
		//				return new CarFactory();
		//			default:
		//				throw new RuntimeException("I'm sorry! We only sell pizzas or cars.");
		//		}
	}
}
