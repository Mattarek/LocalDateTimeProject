package org.CEPiK;

public record RegistrationNumber(String registrationNumber) {

	public RegistrationNumber {
		if (!validation(registrationNumber)) {
			throw new IllegalArgumentException("Invalid registration number: " + registrationNumber);
		}
	}

	public boolean validation(final String registrationNumber) {

		if (registrationNumber == null || registrationNumber.length() <= 4 || registrationNumber.length() > 9) {
			return false;
		}

		final String[] parts = registrationNumber.split(" ");

		if (parts.length != 2) {
			return false;
		}

		final String city = parts[0];
		if (!Character.isLetter(city.charAt(0))) {
			return false;
		}

		if (city.length() == 2 && !Character.isLetterOrDigit(city.charAt(1))) {
			return false;
		}

		if (city.length() == 3 && !Character.isLetterOrDigit(city.charAt(2))) {
			return false;
		}

		final String rest = parts[1];
		for (final char c : rest.toCharArray()) {
			if (!Character.isLetterOrDigit(c)) {
				return false;
			}
		}
		return true;
	}
}