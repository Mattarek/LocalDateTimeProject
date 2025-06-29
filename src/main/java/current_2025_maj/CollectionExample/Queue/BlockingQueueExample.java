package current_2025_maj.CollectionExample.Queue;

//✅ Używać: Wzorce producent–konsument
//📌 Kiedy: Chcesz komunikować się między wątkami (np. kolejka zadań)

//✅ Zalety:
//	- Automatyczne blokowanie (take()/put())
//	- Kontrola nad pojemnością (ArrayBlockingQueue)

//⚠️ Wady:
//	- Blokujące operacje mogą prowadzić do zakleszczeń jeśli źle użyte

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {
	public static void main(final String[] args) {
		final BlockingQueue<String> bq = new LinkedBlockingQueue<>();
		try {
			bq.put("zadanie");
			final String z = bq.take();
		} catch (final InterruptedException e) {
			System.out.println(e);
		}
	}
}
