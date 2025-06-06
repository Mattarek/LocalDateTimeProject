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

		//=================
		final int wynik = Utils.add(5, 3);
		System.out.println(wynik);

		//====================
		final StaticExample staticExample1 = new StaticExample();
		final StaticExample staticExample2 = new StaticExample();
		final StaticExample staticExample3 = new StaticExample();
		final StaticExample staticExample4 = new StaticExample();
		final StaticExample staticExample5 = new StaticExample();
		System.out.println(StaticExample.getCound()); // 5
	}
}
