package megaK.DesignPattarens.Builder;

public class Car {
	private final String brand;
	private final String model;
	private final String year;
	private final String towbar;
	private final String skiRack;
	private final String sunRoof;

	private Car(final Builder carBuilder) {
		brand = carBuilder.brand;
		year = carBuilder.year;
		model = carBuilder.model;
		towbar = carBuilder.towbar;
		sunRoof = carBuilder.sunRoof;
		skiRack = carBuilder.skiRack;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		private String brand;
		private String model;
		private String year;
		private String towbar;
		private String sunRoof;
		private String skiRack;

		public Builder brand(final String brand) {
			this.brand = brand;
			return this;
		}

		public Builder year(final String year) {
			this.year = year;
			return this;
		}

		public Builder model(final String model) {
			this.model = model;
			return this;
		}

		public Builder towbar(final String towbar) {
			this.towbar = towbar;
			return this;
		}

		public Builder sunRoof(final String sunRoof) {
			this.sunRoof = sunRoof;
			return this;
		}

		public Builder skiRack(final String skiRack) {
			this.skiRack = skiRack;
			return this;
		}

		public Car build() {
			return new Car(this);
		}
	}
}
