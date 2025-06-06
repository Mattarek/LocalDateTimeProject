package old_2024.example;

import java.util.Objects;

public class Location {
	private int x;
	private int y;

	public Location(final int x, final int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(final int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(final int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Location{" +
				"x=" + x +
				", y=" + y +
				'}';
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof final Location location)) {
			return false;
		}
		return x == location.x && y == location.y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
}
