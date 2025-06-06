package old_2024.Generics;

import java.util.ArrayList;

class Container<T extends Number> {
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(final T value) {
		this.value = value;
	}

	public void show() {
		System.out.println(value.getClass().getName());
	}

	public void demo(final ArrayList<? extends Number> obj) {

	}
}

public class Generics {
	public static void main(final String[] args) {
		final Container<Integer> obj = new Container<>();
		obj.show();
		obj.demo(new ArrayList<Integer>());
	}
}
