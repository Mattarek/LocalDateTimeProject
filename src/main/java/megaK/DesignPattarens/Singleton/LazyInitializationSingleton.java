package megaK.DesignPattarens.Singleton;

import java.sql.SQLOutput;

public class LazyInitializationSingleton {
	private static LazyInitializationSingleton instance;

	private LazyInitializationSingleton() {
		System.out.println("Creatin LazyInitializationSingleton");
	}

	public static LazyInitializationSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializationSingleton();
		}
		return instance;
	}

	static void someStaticMethod() {
		System.out.println("Calling someStaticMethod");
	}
}
