package current_2025_sierpien.Projekt_Bazy.$1;

import java.time.LocalDate;

public record Customer(String id, String userName, String email, String name, String surname, LocalDate dateOfBirth,
					   String telephoneNumber) {

}
