package megaK.DesignPattarens.Factory;

public class Main {
	public static void main(final String[] args) {

		// Factory - Typ to nasz interface, więc operujemy na abstrakcji
		// dlatego jesteśmy elastyczni.

		// Przed wersją 8:
		//		final Pizza pepperoni = PizzaFactory.preparePizza("Pepperoni");
		//		System.out.println(pepperoni);
		//
		//		final Pizza hawaiian = PizzaFactory.preparePizza("Hawaiian");
		//		System.out.println(hawaiian);
		//
		//		final Pizza margaritta = PizzaFactory.preparePizza("Margaritta");
		//		System.out.println(margaritta);
		//--------------------------------------------------------------------------

		// Po wersji 8:
		final Pizza pepperoni = PizzaFactoryAfterVersionEight.preparePizza("Pepperoni");
		System.out.println(pepperoni);

		final Pizza hawaiian = PizzaFactoryAfterVersionEight.preparePizza("Hawaiian");
		System.out.println(hawaiian);

		final Pizza margaritta = PizzaFactoryAfterVersionEight.preparePizza("Margaritta");
		System.out.println(margaritta);
	}
}
