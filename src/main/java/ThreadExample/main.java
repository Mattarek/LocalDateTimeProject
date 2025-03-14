package ThreadExample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class main {
	public static void main(final String[] args) throws ExecutionException, InterruptedException {
		// 1. Uruchamianie Thread
		final MyThread t1 = new MyThread();
		t1.start();

		// 2. Uruchamianie Runnable
		final Thread t2 = new Thread(new MyRunnable());
		t2.start();

		// 3. ExecutorService i Callable
		final ExecutorService executor = Executors.newFixedThreadPool(2);
		final Future<Integer> future = executor.submit(new MyCallable());
		try {
			System.out.println("Wynik Callable: " + future.get());
		} catch (final ExecutionException | InterruptedException e) {
			System.err.println("Błąd w wykonywaniu Callable: " + e.getMessage());
		}

		// 4. Synchronizacja
		final SharedResource resource = new SharedResource();
		final Thread t3 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				resource.increment();
			}
		});
		final Thread t4 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				resource.increment();
			}
		});
		t3.start();
		t4.start();
		t3.join();
		t4.join();
		System.out.println("Synchronized count: " + resource.getCount());

		// 5. Unikanie deadlocka
		final DeadlockExample deadlockExample = new DeadlockExample();
		final Thread t5 = new Thread(deadlockExample::method1);
		final Thread t6 = new Thread(deadlockExample::method2);
		t5.start();
		t6.start();

		executor.shutdown();
	}
}
