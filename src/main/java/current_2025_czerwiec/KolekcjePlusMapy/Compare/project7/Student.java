package current_2025_czerwiec.KolekcjePlusMapy.Compare.project7;

public class Student {
	private final String name;
	private final double gpa;

	public Student(final String name, final double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", gpa=" + gpa +
				'}';
	}

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}
}
