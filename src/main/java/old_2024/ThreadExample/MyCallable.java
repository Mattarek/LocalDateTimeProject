package old_2024.ThreadExample;

import java.util.concurrent.Callable;

class MyCallable implements Callable<Integer> {
	@Override
	public Integer call() {
		return 42;
	}
}