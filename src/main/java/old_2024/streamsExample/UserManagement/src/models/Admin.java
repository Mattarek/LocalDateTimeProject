package old_2024.streamsExample.UserManagement.src.models;

public class Admin extends User {
	private final int permissionLevel;

	public Admin(final int id, final String firstName, final String lastName, final int permissionLevel) {
		super(id, firstName, lastName);
		this.permissionLevel = permissionLevel;
	}

	public int getPermissionLevel() {
		return permissionLevel;
	}

	@Override
	public String toString() {
		return "Admin{" +
				"permissionLevel=" + permissionLevel +
				"} " + super.toString();
	}
}
