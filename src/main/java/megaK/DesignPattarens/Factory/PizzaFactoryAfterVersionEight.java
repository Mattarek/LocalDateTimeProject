package megaK.DesignPattarens.Factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class PizzaFactoryAfterVersionEight {
	private static final Map<String, Supplier<Pizza>> PIZZA_MAP = new HashMap<>();

	static {
		PIZZA_MAP.put("Pepperoni", Pepperoni::new);
		PIZZA_MAP.put("Hawaiian", HawaiianPizza::new);
	}

	public static Pizza preparePizza(final String whatPizza) { // ta metoda nie może być final
		return Optional.ofNullable(PIZZA_MAP.get(whatPizza))
				.map(Supplier::get)
				.orElseThrow(() -> new RuntimeException(String.format("Sorry, we don't sell: [%s]", whatPizza)));
	}
}
