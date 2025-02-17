package org.ProjektZaJavka.model.exception;

public class RateCalculateException extends RuntimeException {
	public RateCalculateException() {
		super("Rate calculate case not supported.");
	}

	public RateCalculateException(final String message) {
		super(message);
	}
}
