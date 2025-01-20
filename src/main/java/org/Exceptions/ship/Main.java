package org.Exceptions.ship;

import java.io.IOException;

public class Main {
	public static void main(final String[] args) {
		try {
			final Ship ship = new Ship("Shippek");
			if (true) {
				throw new RuntimeException("My new exception!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally.");
		}
		System.out.println("After finally.");
	}
}
