package org.example;

import java.util.Objects;

public class Item {
	private int value;
	private double weight;

	public Item(final int item) {
		setValue(item);
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(final double weight) {
		if (weight < 0) {
			throw new IllegalArgumentException("Weight cannot be negative");
		}
		this.weight = weight;
	}

	public int getValue() {
		return value;
	}

	public void setValue(final int value) {
		this.value = value;
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final Item item)) {
			return false;
		}
		return value == item.value;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(value);
	}

	@Override
	public String toString() {
		return "Item{" +
				"value=" + value +
				'}';
	}
}
