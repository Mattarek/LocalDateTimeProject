package old_2024.Date;

import java.util.Objects;

public class Room {
	private final String roomId;
	private final String name;
	private final String description;

	public Room(final String roomId, final String name, final String description) {
		if (roomId == null || roomId.isBlank() || name == null || name.isBlank()) {
			throw new IllegalArgumentException("Room ID and name must not be null or blank");
		}
		this.roomId = roomId;
		this.name = name;
		this.description = description;
	}

	public String getRoomId() {
		return roomId;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Room{" +
				"roomId='" + roomId + '\'' +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				'}';
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		final Room room = (Room) o;
		return roomId.equals(room.roomId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(roomId, name, description);
	}
}
