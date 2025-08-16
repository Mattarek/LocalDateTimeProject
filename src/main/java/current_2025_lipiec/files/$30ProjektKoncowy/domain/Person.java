package current_2025_lipiec.files.$30ProjektKoncowy.domain;

public class Person {
	final String firstName;
	final String lastName;
	final String email;
	final String ipAddress;

	public Person(final String firstName, final String lastName, final String email, final String ipAddress) {
		this.firstName = firstName;
		this.ipAddress = ipAddress;
		this.email = email;
		this.lastName = lastName;
	}
}
