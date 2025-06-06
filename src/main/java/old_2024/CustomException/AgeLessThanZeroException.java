package old_2024.CustomException;

public class AgeLessThanZeroException extends Exception {
	public AgeLessThanZeroException() {
	}

	public AgeLessThanZeroException(final String message) {
		super(message);
	}

	public AgeLessThanZeroException(final Throwable cause) {
		super(cause);
	}

	public AgeLessThanZeroException(final String message, final Throwable cause) {
		super(message, cause);
	}
}
