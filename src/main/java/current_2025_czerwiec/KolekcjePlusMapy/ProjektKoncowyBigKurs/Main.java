package current_2025_czerwiec.KolekcjePlusMapy.ProjektKoncowyBigKurs;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		final CustomQueue<Person> customQueue = new CustomQueue(new ArrayDeque(), new ArrayDeque<>());
		final PersonCommandProcessor commandProcessor = new PersonCommandProcessor(customQueue);

		final Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			final String command = scanner.nextLine();
			commandProcessor.processCommand(command);
		}

		//		final List<String> commandList = List.of(
		//				"ADD PERSON(Tomasz_Romański)",
		//				"ADD PERSON(Rafał_Adamczuk)",
		//				"ADD PERSON(Tomasz_Romański)",
		//				"ADD PERSON(Tomasz_Romański)",
		//				"ADD PERSON(Tomasz_Romański)",
		//				"ADD PERSON(Tomasz_Romański)",
		//				"ADD PERSON(Mariusz_Wilczek)",
		//				"ADD PERSON(Mariusz_Wilczek)",
		//				"ADD PERSON(Zbigniew_Ratownik)",
		//				"ADD PERSON(Zbigniew_Ratownik, VIP)",
		//				"ADD PERSON(Zbigniew_Ratownik, VIP)",
		//				"ADD PERSON(Zbigniew_Ratownik)",
		//				"ADD PERSON(Zbigniew_Ratownik)",
		//				"PROCESS",
		//				"LEAVE PERSON(Tomasz_Romański_3)",
		//				"LEAVE PERSON(Tomasz_Romański_2)",
		//				"LEAVE PERSON(Tomasz_Romański_4)",
		//				"LEAVE PERSON(Tomasz_Romański_1)",
		//				"LEAVE PERSON(Mariusz_Wilczek)",
		//				"LEAVE PERSON(Mariusz_Wilczek)",
		//				"PROCESS",
		//				"PROCESS",
		//				"PROCESS",
		//				"PROCESS",
		//				"PROCESS",
		//				"PROCESS",
		//				"PROCESS",
		//				"PROCESS",
		//				"PROCESS",
		//				"PROCESS",
		//				"PROCESS",
		//				"PROCESS"
		//		);

		//		for (final String command : commandList) {
		//			commandProcessor.processCommand(command);
		//		}
	}
}
