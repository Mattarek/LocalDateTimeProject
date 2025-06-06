package old_2024.AndretStreamExercieses;

public enum Gender {
	MALE("he/him"),
	FEMALE("she/her"),
	NON_BINARY("they/their");

	private final String pronouns;

	Gender(final String pronouns) {
		this.pronouns = pronouns;
	}

	public String getPronouns() {
		return pronouns;
	}
}
