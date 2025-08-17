package current_2025_lipiec.files.$30ProjektKoncowy.domain;

import java.time.LocalDate;

public record Purchase(long id, Person person, Car car, Location location, LocalDate date) {

	@Override
	public String toString() {
		return "Purchase{" +
				"id=" + id +
				", person=" + person +
				", car=" + car +
				", location=" + location +
				", date=" + date +
				'}';
	}
}
