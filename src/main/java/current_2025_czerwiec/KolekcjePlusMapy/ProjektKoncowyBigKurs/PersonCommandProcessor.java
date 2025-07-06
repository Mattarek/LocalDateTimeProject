package current_2025_czerwiec.KolekcjePlusMapy.ProjektKoncowyBigKurs;

public class PersonCommandProcessor {
	private final CustomQueue customQueue;

	public PersonCommandProcessor(final CustomQueue customQueue) {
		this.customQueue = customQueue;
	}

	private static Person createPerson(final String personId) {
		final String[] splitPersonId = personId.split("_");
		if (splitPersonId.length == 2) {
			return new Person(splitPersonId[0], splitPersonId[1], 1);
		}

		if (splitPersonId.length == 3) {
			return new Person(splitPersonId[0], splitPersonId[1], Integer.parseInt(splitPersonId[2]));
		}

		throw new IllegalArgumentException("Illegal argument: " + personId);
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
			handleAddPerson(command, command.contains("VIP"));
			return;
		}
		if (command.contains("LEAVE PERSON")) {
			handleLeavePerson(command);
			return;
		}
		if (command.contains("PROCESS")) {
			handleProcess(command);
			return;
		}
		throw new RuntimeException("Zła komenda: " + command);
	}

	private void handleAddPerson(final String command, final Boolean isVip) {
		// Sposób nr.1
		//		final String fullName = command.substring(command.indexOf('(') + 1, command.indexOf(')'));
		//		final String[] split = fullName.split("_");
		//		if (split.length == 2) {
		//			final String name = split[0];
		//			final String surname = split[1];
		//			System.out.println(name + "_" + surname);
		//		}

		// Sposób nr.2 bez wyciagniecia do metody incomingPerson
		//		final String personKey = command
		//				.replace("ADD PERSON(", "")
		//				.replace(")", "");
		//
		//		final String[] split = personKey.split("_");
		//
		//		if (split.length == 2) {
		//			// Nie możemy tu przekazać typu konkretnego, bo tworzymy typ generyczny, wiec Java oczekuje
		//			// że przekazany tutaj typ również będzie generyczny.
		//			// Dlatego też w tym miejscu powinniśmy przekazywać element już wcześniej stworzony, jako kolejny argument
		//			// przy wywołaniu naszego CustomQueue.
		//			// Pamiętajmy też, że nie ma czegos takiego jak new T, nie można wywołać konstruktora generyka
		//			customQueue.add(new Person(split[0], split[1], customQueue.getAndIncrementCounter(personKey)));
		//		} else {
		//			throw new IllegalArgumentException("Illegal argument: " + command);
		//		}

		// Sposób nr.3 - z wyciągnieciem do incomingPerson
		final Person incomingPerson = createIncomingPerson(command, isVip);

		// Ternary operator musi być w Javie do czegoś przypisany, dlatego nie robie:
		// isVip ? customQueue.addVip(incomingPerson) : customQueue.add(incomingPerson);

		// Jeśli nie przypisujemy, to wykorzystajmy zwykł if:
		if (isVip) {
			customQueue.addVip(incomingPerson);
			return;
		}
		customQueue.add(incomingPerson);
	}

	private Person createIncomingPerson(final String command, final Boolean isVip) {
		final String personKey = command
				.replace("ADD PERSON(", "")
				.replace(isVip ? ", VIP)" : ")", "");

		System.out.println("personKey: " + personKey);
		System.out.println(personKey + "is VIP:" + isVip);
		final String[] split = personKey.split("_");

		if (split.length == 2) {
			return new Person(split[0], split[1], customQueue.getAndIncrementCounter(personKey));
			//			customQueue.add(new Person(split[0], split[1], customQueue.getAndIncrementCounter(personKey)));
		}
		throw new IllegalArgumentException("Illegal argument: " + command);
	}

	private void handleLeavePerson(final String command) {
		final String personId = command
				.replace("LEAVE PERSON(", "")
				.replace(")", "");

		final Person person = createPerson(personId);
		customQueue.leave(person);
	}

	private void handleProcess(final String command) {
		System.out.println(command);
		customQueue.enter();
	}
}
