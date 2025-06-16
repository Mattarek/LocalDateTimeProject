package megaK.DesignPattarens.Singleton;

public class Main {
	// Singleton
	public static void main(final String[] args) {
		// Od razu tworzymy obiekt.
		StaticBlockSingleton.someStaticMethod();

		// Nie tworzymy obiektu do czasu aż będzie to potrzebne.
		LazyInitializationSingleton.someStaticMethod();
		final LazyInitializationSingleton a = LazyInitializationSingleton.getInstance();
		final LazyInitializationSingleton b = LazyInitializationSingleton.getInstance();
		final LazyInitializationSingleton c = LazyInitializationSingleton.getInstance();
		final LazyInitializationSingleton d = LazyInitializationSingleton.getInstance();
		final LazyInitializationSingleton e = LazyInitializationSingleton.getInstance();

		// Ten sam obiekt w pamięci:
		System.out.println(a); // megaK.DesignPattarens.Singleton.LazyInitializationSingleton@7cc355be
		System.out.println(b); // megaK.DesignPattarens.Singleton.LazyInitializationSingleton@7cc355be
		System.out.println(c); // megaK.DesignPattarens.Singleton.LazyInitializationSingleton@7cc355be
		System.out.println(d); // megaK.DesignPattarens.Singleton.LazyInitializationSingleton@7cc355be
		System.out.println(e); // megaK.DesignPattarens.Singleton.LazyInitializationSingleton@7cc355be
	}
}
