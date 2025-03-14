package ThreadExample;

public class DeadlockExample {
	private final Object lockOne = new Object();
	private final Object lockTwo = new Object();

	public void methodOne() {
		synchronized (lockOne) {
			System.out.println("MethodOne");
		}
	}

	public void methodTwo() {
		synchronized (lockTwo) {
			System.out.println("MethodTwo");
		}
	}
}
