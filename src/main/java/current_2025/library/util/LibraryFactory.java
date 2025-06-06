package current_2025.library.util;

import current_2025.library.model.Librarian;
import current_2025.library.model.Member;
import current_2025.library.model.User;

public class LibraryFactory {
	public static <T extends User> T createUser(final Class<T> clazz, final String id, final String name) {
		// <T extends User> – deklaracja generyczna: typ T musi być podtypem User (czyli User, Member, Librarian, itp.).
		// Class<T> clazz – reprezentuje klasę typu T, czyli np. Member.class lub Librarian.class. Dzięki temu wiemy, jaki dokładnie obiekt ma zostać utworzony.
		if (clazz == Member.class) {
			return clazz.cast(new Member(id, name));
		}
		if (clazz == Librarian.class) {
			return clazz.cast(new Librarian(id, name));
		}
		throw new IllegalArgumentException("Unsupported user type");
	}
}