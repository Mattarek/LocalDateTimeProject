package megaK.DesignPattarens.AbstractFactory;

import megaK.DesignPattarens.Factory.HawaiianPizza;
import megaK.DesignPattarens.Factory.Pepperoni;
import megaK.DesignPattarens.Factory.Pizza;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class PizzaFactory implements AbstractFactory<Pizza> {
	private static final Map<String, Supplier<Pizza>> PIZZA_MAP = new HashMap<>();

	static {
		PIZZA_MAP.put("Pepperoni", Pepperoni::new);
		PIZZA_MAP.put("Hawaiian", HawaiianPizza::new);
	}

	public static Pizza preparePizza(final String whatPizza) { // ta metoda nie może być final
		return switch (whatPizza) {
			case "Pepperoni" -> new Pepperoni();
			case "Hawaiian" -> new HawaiianPizza();
			default -> throw new RuntimeException("Sorry, we only sell Peperoni and Hawaii pizza.");
		};
	}

	@Override
	public Pizza create(final String type) {
		return Optional.ofNullable(PIZZA_MAP.get(type))
				.map(Supplier::get)
				.orElseThrow(() -> new RuntimeException(String.format("Sorry, we don't sell: [%s]", type)));
	}
}
