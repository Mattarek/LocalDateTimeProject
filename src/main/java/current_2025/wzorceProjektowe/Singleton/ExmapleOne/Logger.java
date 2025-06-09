package current_2025.wzorceProjektowe.Singleton.ExmapleOne;

public class Logger {
	// Volatile gwarantuje widoczność zmian między wątkami
	private static volatile Logger instance;

	// Prywatny konstruktor zapobiega tworzeniu instancji spoza klasy
	private Logger() {
		System.out.println("Logger utworzony");
	}

	// Metoda zapewniająca dostęp do jedynej instancji
	public static Logger getInstance() {
		if (instance == null) {
			synchronized (Logger.class) {
				synchronized (Logger.class) {
					if (instance == null) {
						instance = new Logger();
					}
				}
			}
		}
		return instance;
	}

	public void log(final String message) {
		System.out.println("[LOG] " + message);
	}
}
