package current_2025_maj.Map;

import java.util.Hashtable;

//🔹 Hashtable (❌ przestarzała, ale wciąż używana)
//📌 Cechy:
//	- Synchronizowana (thread-safe), ale zła wydajność.
//	- Nie pozwala na null jako klucz lub wartość.
//	- Zastępowana przez ConcurrentHashMap.
public class HashtableExample {
	public static void main(final String[] args) {
		final Hashtable<String, String> loginData = new Hashtable<>();
		loginData.put("admin", "1234");
		loginData.put("user", "abcd");

		System.out.println(loginData);
	}
}
