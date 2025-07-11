package old_2024.OptionalExamples;

public class User {
	protected int id;
	protected String firstName;
	protected String lastName;

	public User(final int id, final String firstName, final String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return id + ": " + firstName + " " + lastName;
	}
}
