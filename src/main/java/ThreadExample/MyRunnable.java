package ThreadExample;

class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("Runnable działa: " + Thread.currentThread().getName());
	}
}