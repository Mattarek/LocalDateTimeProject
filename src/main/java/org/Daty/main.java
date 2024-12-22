package org.Daty;

import java.time.LocalDateTime;
import java.util.List;

public class main {
	public static void main(final String[] args) {
		final ReservationManager manager = new ReservationManager();

		final Room room1 = new Room("R1", "Sala A", "Sala z projektorem");
		final Room room2 = new Room("R2", "Sala B", "Sala z tablicą interaktywną");
		
		manager.addRoom(room1);
		manager.addRoom(room2);

		try {
			manager.addReservation(room1, LocalDateTime.of(2024, 12, 22, 10, 0), LocalDateTime.of(2024, 12, 22, 12, 0));
			manager.addReservation(room2, LocalDateTime.of(2024, 12, 22, 11, 0), LocalDateTime.of(2024, 12, 22, 13, 0));
		} catch (final IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		final List<Room> availableRooms = manager.getAvailableRooms(LocalDateTime.of(2024, 12, 22, 10, 30), LocalDateTime.of(2024, 12, 22, 11, 30));
		System.out.println("Dostępne sale: " + availableRooms);

		System.out.println("Wszystkie rezerwacje:");
		for (final Reservation reservation : manager.getAllReservations()) {
			System.out.println(reservation);
		}
	}
}
