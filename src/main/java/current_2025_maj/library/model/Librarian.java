package current_2025_maj.library.model;

public class Librarian extends User {
	public Librarian(final String id, final String name) {
		super(id, name);
	}

	public String getRole() {
		return "Librarian";
	}
}
