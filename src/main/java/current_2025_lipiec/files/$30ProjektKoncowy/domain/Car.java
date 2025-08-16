package current_2025_lipiec.files.$30ProjektKoncowy.domain;

import java.math.BigDecimal;

public class Car {
	final String color;
	final String vin;
	final String company;
	final String model;
	final String year;
	final BigDecimal price;

	public Car(final String color, final String year, final String model, final String company, final String vin, final BigDecimal price) {
		this.color = color;
		this.year = year;
		this.model = model;
		this.company = company;
		this.vin = vin;
		this.price = price;
	}
}
