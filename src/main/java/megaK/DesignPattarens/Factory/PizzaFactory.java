package megaK.DesignPattarens.Factory;

public class PizzaFactory {

	public static Pizza preparePizza(final String whatPizza) { // ta metoda nie może być final
		return switch (whatPizza) {
			case "Pepperoni" -> new Pepperoni();
			case "Hawaiian" -> new HawaiianPizza();
			default -> throw new RuntimeException("Sorry, we only sell Peperoni and Hawaii pizza.");
		};
	}
}
