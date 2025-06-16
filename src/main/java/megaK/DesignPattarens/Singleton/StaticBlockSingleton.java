package megaK.DesignPattarens.Singleton;

public class StaticBlockSingleton {
	private static final StaticBlockSingleton instance;

	// Eager, zotanie utworzona od razu, nawet jeśli nie wywołamy getInstance
	static {
		try { // na wszelki wypadek jakby został wyrzucony jakiś wyjątek
			instance = new StaticBlockSingleton();
		} catch (final Exception e) {
			throw new RuntimeException("Exception thrown while creating instance.");
		}
	}

	private StaticBlockSingleton() {
		System.out.println("Private constructor");
	}

	public static StaticBlockSingleton getInstance() {
		System.out.println("getInstance() StaticBlockSingleton");
		return instance;
	}

	static void someStaticMethod() {
		System.out.println("Calling someStaticMethod");
	}
}
