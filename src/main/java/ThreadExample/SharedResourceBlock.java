package ThreadExample;

class SharedResourceBlock {
	private final Object lock = new Object();
	private int count;

	public void increment() {
		synchronized (lock) {
			count++;
		}
	}

	public int getCount() {
		synchronized (lock) {
			return count;
		}
	}
}