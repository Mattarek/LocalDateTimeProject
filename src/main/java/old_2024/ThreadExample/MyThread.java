package old_2024.ThreadExample;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Wątek działa: " + currentThread().getName());
	}
}