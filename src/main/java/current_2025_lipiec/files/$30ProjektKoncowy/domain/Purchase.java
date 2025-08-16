package current_2025_lipiec.files.$30ProjektKoncowy.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Purchase {
	final long id;
	final String firstName;
	final String lastName;
	final Car car;
	final Location location;
	final LocalDate date;

	public Purchase(final long id,
					final String firstName,
					final String lastName,
					final LocalDate date,
					final Location location,
					final Car car
	) {
		this.id = id;
		this.firstName = firstName;
		this.date = date;
		this.location = location;
		this.car = car;
		this.lastName = lastName;
	}
}
