package megaK.DesignPattarens.Builder;

import lombok.Builder;

@Builder
public class Car {
	private final String brand;
	private final String model;
	private final String year;
	private final String towbar;
	private final String skiRack;
	private final String sunRoof;
}
