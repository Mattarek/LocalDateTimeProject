package old_2024.InitBlock;

public class A {
	// Statyczne pole
	static int staticFieldA = initializeStaticFieldA();

	// Statyczny blok inicjalizacyjny
	static {
		System.out.println("Statyczny blok klasy A");
	}

	// Pole instancji
	int instanceFieldA = initializeInstanceFieldA();

	// Blok inicjalizacyjny instancji
	{
		System.out.println("Blok instancji klasy A");
	}

	// Konstruktor klasy A
	A() {
		System.out.println("Konstruktor klasy A");
	}

	// Metoda do inicjalizacji statycznego pola
	static int initializeStaticFieldA() {
		System.out.println("Inicjalizacja statycznego pola klasy A");
		return 1;
	}

	// Metoda do inicjalizacji pola instancji
	int initializeInstanceFieldA() {
		System.out.println("Inicjalizacja pola instancji klasy A");
		return 10;
	}
}
