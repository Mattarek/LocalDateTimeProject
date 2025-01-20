package org.Exceptions.ship;

import java.io.IOException;

public class Ship {
	public static final String MODEL = "TITANIC";
	private final String name;

	public Ship(final String name) {
		this.name = name;
	}

	//	{
	//		if (true) {
	//			throw new IOException();
	//		}
	//	}
	//
	//	public Ship() throws IOException {
	//		System.out.println("Here");
	//	}
	//
	//	public Ship(final String name) throws IOException {
	//		System.out.println("There");
	//		this.name = name;
	//	}
}
