package current_2025_lipiec.files.$30ProjektKoncowy.services;

import current_2025_lipiec.files.$30ProjektKoncowy.domain.Car;
import current_2025_lipiec.files.$30ProjektKoncowy.domain.Location;
import current_2025_lipiec.files.$30ProjektKoncowy.domain.Person;
import current_2025_lipiec.files.$30ProjektKoncowy.domain.Purchase;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PurchesMappingService {
	public static Purchase myPurcahse(final String inputDataLine) {
		final String[] row = inputDataLine.split(",");
		final long id = Long.valueOf(row[0]);
		final String firstName = row[1];
		final String lastName = row[2];
		final String email = row[3];
		final String ipAddress = row[4];
		final String color = row[5];
		final String vin = row[6];
		final String company = row[7];
		final String model = row[8];
		final String modelYear = row[9];

		// nie parsujemy na longa aby nie trafić liczb po przecinku
		final BigDecimal price = new BigDecimal(row[10].replaceAll("[€\"]", ""));
		final String country = row[11];
		final String city = row[12];
		final LocalDate date = LocalDate.parse(row[13]);

		return new Purchase(
				id,
				new Person(firstName, lastName, email, ipAddress),
				new Car(color, modelYear, model, company, vin, price),
				new Location(country, city),
				date
		);
	}

	public static String toCSV(final Purchase purchase) {
		return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s",
				purchase.id(),
				purchase.person().firstName(),
				purchase.person().lastName(),
				purchase.person().email(),
				purchase.person().ipAddress(),
				purchase.car().color(),
				purchase.car().vin(),
				purchase.car().company(),
				purchase.car().model(),
				purchase.car().year(),
				purchase.car().price(),
				purchase.location().getCountry(),
				purchase.location().getCity(),
				purchase.date()
		);
	}
}
