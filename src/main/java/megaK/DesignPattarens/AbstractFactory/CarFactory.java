package megaK.DesignPattarens.AbstractFactory;

import megaK.DesignPattarens.Factory.HawaiianPizza;
import megaK.DesignPattarens.Factory.Pepperoni;
import megaK.DesignPattarens.Factory.Pizza;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class CarFactory implements AbstractFactory<Car> {
	private static final Map<String, Supplier<Car>> CAR_MAP = new HashMap<>();

	static {
		CAR_MAP.put("SUV", SUV::new);
		CAR_MAP.put("Cabriolet", Cabriolet::new);
	}

	@Override
	public Car create(final String type) {
		return Optional.ofNullable(CAR_MAP.get(type))
				.map(Supplier::get)
				.orElseThrow(() -> new RuntimeException(String.format("Sorry, we don't sell: [%s]", type)));
	}
}
