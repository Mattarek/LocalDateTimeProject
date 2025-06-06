package old_2024.Lambda;

import java.util.Objects;

public class Animal {
	private final String name;
	private final boolean canFly;
	private final boolean canBark;

	public Animal(final String name, final boolean canFly, final boolean canB) {
		this.name = name;
		this.canFly = canFly;
		canBark = canB;
	}

	@Override
	public String toString() {
		return "Animal{" +
				"name='" + name + '\'' +
				", canFly=" + canFly +
				", canBark=" + canBark +
				'}';
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final Animal animal)) {
			return false;
		}
		return canFly == animal.canFly && canBark == animal.canBark && Objects.equals(name, animal.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, canFly, canBark);
	}
}

