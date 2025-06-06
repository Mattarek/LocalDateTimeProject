package current_2025.library.model;

public class Member extends User {
	public Member(final String id, final String name) {
		super(id, name);
	}

	@Override
	public String getRole() {
		return "Member";
	}
}
