package old_2024.Date;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReservationManager {
	private final List<Room> rooms = new ArrayList<>();
	private final List<Reservation> reservations = new ArrayList<>();

	public void addRoom(final Room room) {
		if (rooms.contains(room)) {
			throw new IllegalArgumentException("Sala o tym ID już istnieje");
		}
		rooms.add(room);
	}

	public void addReservation(final Room room, final LocalDateTime startTime, final LocalDateTime endTime) {
		final Reservation newReservation = new Reservation(room, startTime, endTime);
		for (final Reservation reservation : reservations) {
			if (reservation.getRoom().equals(room) && startTime.isBefore(reservation.getEndTime()) && endTime.isBefore(reservation.getStartTime())) {
				throw new IllegalArgumentException("Konflikt rezerwacji dla sali: " + room.getName());
			}
		}
		reservations.add(newReservation);
	}

	public List<Room> getAvailableRooms(final LocalDateTime startTime, final LocalDateTime endTime) {
		final List<Room> availableRooms = new ArrayList<>(rooms);
		for (final Reservation reservation : reservations) {
			if (startTime.isBefore(reservation.getEndTime()) && endTime.isAfter(reservation.getStartTime())) {
				availableRooms.remove(reservation.getRoom());
			}
		}
		return availableRooms;
	}

	public List<Reservation> getAllReservations() {
		return new ArrayList<>(reservations);
	}
}
