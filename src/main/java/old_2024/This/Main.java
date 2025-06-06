package old_2024.This;

import java.util.ArrayList;
import java.util.List;

public class Main {
	private String name;
	private int age;

	public static void main(final String[] args) {
		final List testList = new ArrayList();
		testList.stream().limit(3);
	}

	public void setName(final String name, final int newAge) {
		this.name = name;
		age = newAge;
	}
}
