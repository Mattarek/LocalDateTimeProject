package old_2024.CEPiK;

public record VIN(String vin) {

	public VIN {
		if (!isVinCorrect(vin)) {
			throw new IllegalArgumentException("Invalid VIN number: " + vin);
		}
	}

	public boolean isVinCorrect(final String vin) {
		return vin.length() == 17 &&
				!vin.contains("O") &&
				!vin.contains("Q") &&
				!vin.contains("I");
	}
}
