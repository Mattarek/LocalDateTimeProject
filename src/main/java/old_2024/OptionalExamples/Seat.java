package old_2024.OptionalExamples;

import java.util.Optional;

public class Seat {
	private Optional<String> occupant = Optional.empty();

	public static void main(final String[] args) {
		final Seat seat = new Seat();
		seat.reserve("John Doe");
		System.out.println("Rezerwując: " + seat.getOccupant());

		seat.reserve("Jane Smith");
		System.out.println("Rezerwując: " + seat.getOccupant());
	}

	public void reserve(final String name) {
		if (occupant.isEmpty()) {
			occupant = Optional.of(name);
		} else {
			System.out.println("Miejsce już zajęte!");
		}
	}

	public String getOccupant() {
		return occupant.orElse("Brak rezerwacji");
	}
}
