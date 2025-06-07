package current_2025.wzorceProjektowe;

public class Logger {
	private static Logger instance;

	private Logger() {
	}

	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}

	public void log(final String message) {
		System.out.println("[LOG} " + message);
	}
}
