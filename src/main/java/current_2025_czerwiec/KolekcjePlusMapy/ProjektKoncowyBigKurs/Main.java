package current_2025_czerwiec.KolekcjePlusMapy.ProjektKoncowyBigKurs;

import java.util.ArrayDeque;
import java.util.List;

public class Main {

	public static void main(final String[] args) {
		final CustomQueue<Person> customQueue = new CustomQueue(new ArrayDeque());
		final PersonCommandProcessor commandProcessor = new PersonCommandProcessor(customQueue);

		final CustomQueue<Person> queue = new CustomQueue<>(new ArrayDeque<>());
		final List<String> commandList = List.of(
				"ADD PERSON(Tomasz_Romański)",
				"ADD PERSON(Rafał_Adamczuk)",
				"ADD PERSON(Tomasz_Romański)",
				"ADD PERSON(Tomasz_Romański)",
				"ADD PERSON(Mariusz_Wilczek)",
				"ADD PERSON(Zbigniew_Ratownik)",
				"ADD PERSON(Zbigniew_Ratownik)",
				"ADD PERSON(Zbigniew_Ratownik)",
				"ADD PERSON(Zbigniew_Ratownik)",
				"ADD PERSON(Zbigniew_Ratownik)",
				//				"PROCESS",
				"LEAVE PERSON(Tomasz_Romański)",
				"LEAVE PERSON(Tomasz_Romański)",
				"LEAVE PERSON(Tomasz_Romański)",
				"LEAVE PERSON(Tomasz_Romański)",
				"LEAVE PERSON(Mariusz_Wilczek)",
				"LEAVE PERSON(Mariusz_Wilczek)"
				//				"PROCESS",
				//				"PROCESS",
				//				"PROCESS"
		);

		for (final String command : commandList) {
			commandProcessor.processCommand(command);
		}
	}
}
