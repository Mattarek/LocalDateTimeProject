package megaK.DesignPattarens.Builder;

public class Main {
	public static void main(final String[] args) {
		// Builder

		final Car builder = Car.builder()
				.brand("Ford")
				.model("Mustang")
				.year("1969")
				.skiRack("skiRack")
				.build();

		System.out.println(builder);
	}
}
