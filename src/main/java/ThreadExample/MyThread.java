package ThreadExample;

public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Wątek działą: " + currentThread().getName());
	}
}
