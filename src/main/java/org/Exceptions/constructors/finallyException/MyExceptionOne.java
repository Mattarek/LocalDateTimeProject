package org.Exceptions.constructors.finallyException;

import java.io.IOException;

public class MyExceptionOne extends Exception {

	//	{
	//		if (1 == 1) {
	//			throw new IOException();
	//		}
	//	}

	public MyExceptionOne(final String message) {
		super(message);
	}
}

