package current_2025_maj.library.model;

public abstract class User {
	protected String id;
	protected String name;

	public User(final String id, final String name) {
		this.id = id;
		this.name = name;
	}

	public abstract String getRole();

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return STR."User{id='\{id}', name='\{name}'}";
	}
}
