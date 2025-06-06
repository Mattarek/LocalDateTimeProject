package old_2024.InitBlock;

class B extends A {
	// Statyczne pole
	static int staticFieldB = initializeStaticFieldB();

	// Statyczny blok inicjalizacyjny
	static {
		System.out.println("Statyczny blok klasy B");
	}

	// Pole instancji
	int instanceFieldB = initializeInstanceFieldB();

	// Blok inicjalizacyjny instancji
	{
		System.out.println("Blok instancji klasy B");
	}

	// Konstruktor klasy B
	B() {
		System.out.println("Konstruktor klasy B");
	}

	// Metoda do inicjalizacji statycznego pola
	static int initializeStaticFieldB() {
		System.out.println("Inicjalizacja statycznego pola klasy B");
		return 2;
	}

	// Metoda do inicjalizacji pola instancji
	int initializeInstanceFieldB() {
		System.out.println("Inicjalizacja pola instancji klasy B");
		return 20;
	}
}