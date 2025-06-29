package current_2025_maj.Coffee;

import java.util.Objects;

public class Coffee {
	private final CoffeeType type;
	private final Size size;

	public Coffee(final CoffeeType type, final Size size) {
		this.type = type;
		this.size = size;
	}

	public double calculatePrice() {
		return type.getBasePrice() * size.getMultiplier();
	}

	@Override
	public String toString() {
		return STR."Coffee{type=\{type}, size=\{size}}";
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final Coffee coffee)) {
			return false;
		}
		return type == coffee.type && size == coffee.size;
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, size);
	}
}
