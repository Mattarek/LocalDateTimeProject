package megaK.DesignPattarens.Factory;

public class Main {
	public static void main(final String[] args) {
		final Pizza pepperoni = PizzaFactory.preparePizza("Pepperoni");
		System.out.println(pepperoni);

		final Pizza hawaiian = PizzaFactory.preparePizza("Hawaiian");
		System.out.println(hawaiian);

		final Pizza margaritta = PizzaFactory.preparePizza("Margaritta");
		System.out.println(margaritta);
	}
}
