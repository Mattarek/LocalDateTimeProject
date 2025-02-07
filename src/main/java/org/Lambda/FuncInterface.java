package org.Lambda;

public interface FuncInterface {
	void abstractFun(int x);

	default void normalFun() {
		System.out.println("Hello");
	}
}
