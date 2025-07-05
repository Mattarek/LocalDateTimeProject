package current_2025_czerwiec.KolekcjePlusMapy.ProjektKoncowyBigKurs;

public class PersonCommandProcessor {
	private final CustomQueue customQueue;

	public PersonCommandProcessor(final CustomQueue customQueue) {
		this.customQueue = customQueue;
	}

	public void processCommand(final String command) {
		//				"ADD PERSON(Tomasz_Romański",
		//				"ADD PERSON(Rafał_Adamczuk",
		//				"ADD PERSON(Tomasz_Romański",
		//				"ADD PERSON(Mariusz_Wilczek",
		//				"ADD PERSON(Zbigniew_Ratownik",
		//				"PROCESS",
		//				"LEAVE PERSON(Tomasz_Romański_2)",
		//				"LEAVE PERSON(Mariusz_Wilczek)",
		//				"PROCESS",
		//				"PROCESS",
		//				"PROCESS"
		if (command.contains("ADD PERSON")) {
			handleAddPerson(command);
			return;
		}
		if (command.contains("LEAVE PERSON")) {
			handleLeavePerson(command);
			return;
		}
		if ("PROCESS".equals(command)) {
			handleProcess(command);
			return;
		}
		throw new RuntimeException("Zła komenta: " + command);
	}

	private void handleAddPerson(final String command) {
		// Sposób nr.1
		//		final String fullName = command.substring(command.indexOf('(') + 1, command.indexOf(')'));
		//		final String[] split = fullName.split("_");
		//		if (split.length == 2) {
		//			final String name = split[0];
		//			final String surname = split[1];
		//			System.out.println(name + "_" + surname);
		//		}

		// Sposób nr.2
		final String personKey = command
				.replace("ADD PERSON(", "")
				.replace(")", "");

		final String[] split = personKey.split("_");

		if (split.length == 2) {
			final String name = split[0];
			final String surname = split[1];
			final Integer counter = customQueue.getAndIncrementCounter(personKey);

			// Nie możemy tu przekazać typu konkretnego, bo tworzymy typ generyczny, wiec Java oczekuje
			// że przekazany tutaj typ również będzie generyczny.
			// Dlatego też w tym miejscu powinniśmy przekazywać element już wcześniej stworzony, jako kolejny argument
			// przy wywołaniu naszego CustomQueue.
			// Pamiętajmy też, że nie ma czegos takiego jak new T, nie można wywołać konstruktora generyka
			customQueue.add(new Person(name, surname, counter));
		}
	}

	private void handleLeavePerson(final String command) {
	}

	private void handleProcess(final String command) {
	}
}
