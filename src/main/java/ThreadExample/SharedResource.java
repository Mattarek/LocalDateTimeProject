package ThreadExample;

public class SharedResource {
	private int count;

	public synchronized void increment() {
		count++;
	}

	public synchronized int getCount() {
		return count;
	}
}
