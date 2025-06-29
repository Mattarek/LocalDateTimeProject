package current_2025_maj.Coffee;

public enum Size {
	SMALL(1.0),
	MEDIUM(1.2),
	LARGE(1.5);

	private final double multiplier;

	Size(final double multiplier) {
		this.multiplier = multiplier;
	}

	public double getMultiplier() {
		return multiplier;
	}
}
