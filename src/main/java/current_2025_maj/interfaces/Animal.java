package current_2025_maj.interfaces;

public interface Animal {
	// zmieniac modyfikatory dostępu możemy jedynie na bardziej restrykcyjne
	// np. package private na private
	int PORT = 8888;  // to jest to samo co: public static final int PORT = 8080;

	static void log() {
		System.out.println("This is an animal interface!");
	}

	static void log(final String message) {
		System.out.println("LOG: " + message);
	}

	void fooo();  // to jest to samo co: public abstract void foo();

	void makeNoise(); // Metoda abstrakcyjna – musi być zaimplementowana w klasie

	// MEtoda defaultowa, czyli ma już swoją implementacje, jeśli nie nadpiszemy jej
	// w klasie, to dostarczymy tą domyślną strukture.
	default void eat() {
		System.out.println("Animal is eating...");
	}
}
