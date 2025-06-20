package old_2024.ThreadExample;

class DeadlockExample {
	private final Object lock1 = new Object();
	private final Object lock2 = new Object();

	public void method1() {
		synchronized (lock1) {
			synchronized (lock2) {
				System.out.println("Method1");
			}
		}
	}

	public void method2() {
		synchronized (lock2) {
			synchronized (lock1) {
				System.out.println("Method2");
			}
		}
	}
}
