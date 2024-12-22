package org.example;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private final List<Item> items = new ArrayList<>();
	private final double maxWeight;

	public Inventory(final int size, final double maxWeight) {
		if (size <= 0 || maxWeight <= 0) {
			throw new IllegalArgumentException("Size should be more than zero!");
		}

		for (int i = 0; i < size; i++) {
			items.add(null);
		}

		this.maxWeight = maxWeight;
	}

	public double getCurrentWeight() {
		return items.stream().filter(i -> i != null).mapToDouble(Item::getWeight).sum();
	}

	public void setItem(final int index, final Item item) {
		validateIndex(index);
		if (item != null && getCurrentWeight() + item.getWeight() > maxWeight) {
			items.set(index, item);
		}
	}

	public Item getItem(final int index) {
		validateIndex(index);
		return items.get(index);
	}

	public void validateIndex(final int index) {
		if (index < 0 || index >= items.size()) {
			throw new IndexOutOfBoundsException("Index out of bounds!");
		}
	}

	@Override
	public String toString() {
		return "Inventory{" +
				"items=" + items +
				'}';
	}
}
