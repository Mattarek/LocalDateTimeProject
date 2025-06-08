package current_2025.wzorceProjektowe.Singleton.ExmapleOne;

public class App {
	public static void main(final String[] args) {
		final Runnable task = () -> {
			final Logger logger = Logger.getInstance();
			logger.log("Wątek: " + Thread.currentThread().getName());
		};

		// Tworzymy kilka wątków, które równocześnie próbują uzyskać instancję Loggera
		final Thread t1 = new Thread(task, "T1");
		final Thread t2 = new Thread(task, "T2");
		final Thread t3 = new Thread(task, "T3");

		t1.start();
		t2.start();
		t3.start();
	}
}
