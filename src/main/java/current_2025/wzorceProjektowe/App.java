package current_2025.wzorceProjektowe;

public class App {
	public static void main() {
		final Logger logger1 = Logger.getInstance();
		final Logger logger2 = Logger.getInstance();
		final Logger logger3 = Logger.getInstance();
		final Logger logger4 = Logger.getInstance();
		final Logger logger5 = Logger.getInstance();
		final Logger logger6 = Logger.getInstance();
		final Logger logger7 = Logger.getInstance();

		logger1.log("Aplikacja uruuchomiona.");
		logger1.log("Trwa przetwarzanie danych...");

		System.out.println("Czy logger1 == logger2? " + (logger1 == logger2));
		System.out.println("Czy logger1 == logger2? " + (logger2 == logger3));
		System.out.println("Czy logger1 == logger2? " + (logger3 == logger4));
		System.out.println("Czy logger1 == logger2? " + (logger4 == logger5));
		System.out.println("Czy logger1 == logger2? " + (logger5 == logger6));
		System.out.println("Czy logger1 == logger2? " + (logger6 == logger7));
	}
}