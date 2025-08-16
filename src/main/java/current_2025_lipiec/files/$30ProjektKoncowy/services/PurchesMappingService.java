package current_2025_lipiec.files.$30ProjektKoncowy.services;

import current_2025_lipiec.files.$30ProjektKoncowy.domain.Car;
import current_2025_lipiec.files.$30ProjektKoncowy.domain.Person;
import current_2025_lipiec.files.$30ProjektKoncowy.domain.Purchase;

import java.math.BigDecimal;
import java.time.LocalDate;

//id,first_name,last_name,email,ip_address,color,car_vin,car_company,car_model,car_m
// odel_year,car_price,country,city,date
//1,Marsh,Polon,mpolon0@google.de,155.43.28.214,#255a97,3D7TT2HT8BG370793,Chevrolet,Cobalt,2006,"€67487.58",Czech Republic,Bořetice,2020-09-03

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
		final BigDecimal price = new BigDecimal(row[10].substring(1));
		final String country = row[11];
		final String city = row[12];
		final LocalDate date = LocalDate.parse(row[13]);

		Long.valueOf(row[0]);
		return new Purchase(
				id,
				new Person(firstName, lastName, email, ipAddress),
				new Car(color, modelYear, model, company, vin, price)
		);
	}
}
