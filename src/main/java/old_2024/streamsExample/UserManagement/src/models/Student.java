package old_2024.streamsExample.UserManagement.src.models;

public class Student extends User {
	private final String indexNumber;

	public Student(final int id, final String firstName, final String lastName, final String indexNumber) {
		super(id, firstName, lastName);
		this.indexNumber = indexNumber;
	}

	public String getIndexNumber() {
		return indexNumber;
	}

	@Override
	public String toString() {
		return "Student{" +
				"indexNumber='" + indexNumber + '\'' +
				"} " + super.toString();
	}
}
