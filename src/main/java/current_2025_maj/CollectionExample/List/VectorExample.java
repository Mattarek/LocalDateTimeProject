package current_2025_maj.CollectionExample.List;

import java.util.List;
import java.util.Vector;

//✅ Vector<E> - NIEZALECANA
//Opis: Stara wersja ArrayList, synchronizowana (wszystkie metody synchronized).
//➕ Zalety:
//	- Synchronizowana (bezpieczna wątkowo bez dodatkowego kodu)
//
//➖ Wady:
//	- Wolniejsza od ArrayList przez narzut synchronizacji
//	- Uważana za przestarzałą – w nowych aplikacjach niezalecana
//
//🎯 Kiedy używać:
//	- Rzadko. Tylko jeśli musisz pracować z bardzo starym kodem lub API wymagającym Vector
//	- Współczesna alternatywa: Collections.synchronizedList(new ArrayList<>())
//	- Przykład: starsze systemy wielowątkowe

public class VectorExample {
	public static void main(final String[] args) {
		final List<String> logMessage = new Vector<>();

		logMessage.add("Start aplikacji");
		logMessage.add("Połączenie z bazą danych");
		logMessage.add("Błąd: timeout");

		for (final String log : logMessage) {
			System.out.println(log);
		}
	}
}
