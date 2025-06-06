package current_2025.tests;

public class AnonymusClass {
	public static void main(final String[] args) {
		final Car car = new Car() {
			@Override
			public void run() {
				System.out.println("Run");
			}

			public void stop() {
				System.out.println("Stop");
			}
		};
		car.run();
		car.stop();
	}
}
