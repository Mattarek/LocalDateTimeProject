package megaK.DesignPattarens.AbstractFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Main {

	public static void main(final String[] args) {
		final AbstractFactory<?> pizzaFactory = FactoryProvider.getFactory("Pizza");
		final Object hawaiian = pizzaFactory.create("Hawaiian");
		// Typ Object dlatego, że jako typ podaliśmy <?>, więc skoro
		// tworzy niewiadomo co, to przypisujemy go do Object, bo wszystko w Javie dziedziczy z Object

		final AbstractFactory<?> carFactory = FactoryProvider.getFactory("Car");
		final Object suv = carFactory.create("SUV");

		System.out.println(hawaiian);
		System.out.println(suv);
	}
}
