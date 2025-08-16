package current_2025_lipiec.files.$30ProjektKoncowy.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Purchase {
	final long id;
	final Person person;
	final Car car;
	final Location location;
	final LocalDate date;

	public Purchase(final long id, final Person person, final Car car, final Location location, final LocalDate date) {
		this.id = id;
		this.person = person;
		this.car = car;
		this.location = location;
		this.date = date;
	}

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
