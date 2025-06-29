package current_2025_czerwiec.Compare.project10;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
	//	📌 Opis:
	//	Masz klasę Candidate, która reprezentuje kandydatów do pracy. Każdy kandydat ma:
	//	String name
	//	Optional<LocalDate> interviewDate
	//	int score (ocena za zadanie rekrutacyjne)
	//	Zadaniem jest posortować kandydatów według następujących zasad:
	//	Najpierw ci, którzy mają zaplanowaną rozmowę kwalifikacyjną (interviewDate.isPresent()).
	//	Wśród nich — wcześniejsze daty rozmów mają wyższy priorytet.
	//	Kandydaci bez rozmowy są sortowani malejąco po score.

	public static void main(final String[] args) {
		final List<Candidate> candidates = List.of(
				new Candidate("Anna", Optional.of(LocalDate.of(2025, 05, 10)), 85),
				new Candidate("Tomek", Optional.empty(), 92),
				new Candidate("Zosia", Optional.of(LocalDate.of(2025, 05, 10)), 85),
				new Candidate("Bartek", Optional.empty(), 85),
				new Candidate("Kasia", Optional.of(LocalDate.of(2025, 05, 10)), 85)
		);

		final Comparator<Candidate> comparator = Comparator
				// 1. Najpierw porównujemy po obecności daty rozmowy kwalifikacyjnej
				//    -> jeśli interviewDate jest obecne => przypisz 0, nie zmieniaj kolejnosci
				//    -> jeśli brak daty => przypisz 1 zamień kolejnością, dzięki temu, na początku mamy tych, którzy
				//    mają umówioną już datę rozmowy, a ci którzy nie maja idą na dól listy
				.comparing((Candidate c) -> c.getInterviewDate().isPresent() ? 0 : 1)

				// 2. W przypadku, gdy oboje kandydaci mają datę, porównujemy je rosnąco
				//    -> wcześniejsza data = wyższy priorytet
				//    -> jeśli interviewDate brak, użyj LocalDate.MAX (czyli bardzo daleka przyszłość)
				.thenComparing(c -> c.getInterviewDate().orElse(LocalDate.MAX))

				// 3. Gdy daty rozmów są takie same (lub oba ich nie mają), sortuj po score rosnąco
				//    -> UWAGA: score rosnąco = niższy wynik wyżej. Jeśli chcesz malejąco, użyj: -c.getScore()
				.thenComparing(Candidate::getScore);

		candidates.stream()               // Tworzymy strumień kandydatów
				.sorted(comparator)      // Sortujemy ich zgodnie z powyższym wielokryterialnym komparatorem
				.forEach(System.out::println); // Wypisujemy każdy obiekt po sortowaniu
	}
}
