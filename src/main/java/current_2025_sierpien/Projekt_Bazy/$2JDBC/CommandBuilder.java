package current_2025_sierpien.Projekt_Bazy.$2JDBC;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CommandBuilder {

	Optional<Command> buildCommand(final String line) {
		final String[] split = line.split(";");
		final String commandTypeSplit = split[0];
		if (!Command.Type.valuesAsList().contains(commandTypeSplit)) {
			System.err.printf("User provided unknown command: [%s]%n", commandTypeSplit);
			return Optional.empty();
		}

		final List<String> stringCommandWithParamsExtracted = Arrays.asList(split).subList(1, split.length);

		final var parametersMap = stringCommandWithParamsExtracted.stream()
				.map(item -> item.split("="))
				.collect(Collectors.toMap(itemSplit -> itemSplit[0], itemSplit -> itemSplit[1]));

		final List<String> sortingParams = Optional.ofNullable(parametersMap.get(ToDoItem.Field.SORT.name()))
				.map(params -> List.of(params.split(",")))
				.orElse(Collections.emptyList());

		final Command.Type commandType = Command.Type.from(commandTypeSplit);
		final ToDoItem toDoItem = buildToDoItem(commandType, parametersMap);
		return Optional.of(new Command(
				commandType,
				toDoItem,
				findSortingField(sortingParams),
				findSortingDir(sortingParams)
		));
	}

	private ToDoItem.Field findSortingField(final List<String> sortingParams) {
		if (sortingParams.isEmpty()) {
			return ToDoItem.Field.NAME;
		}

		try {
			return ToDoItem.Field.valueOf(sortingParams.get(0));
		} catch (final Exception e) {
			System.err.printf("Sorting field is not specified. Default: [%s]%n", ToDoItem.Field.NAME);
			return ToDoItem.Field.NAME;
		}
	}

	private Command.SortDir findSortingDir(final List<String> sortingParams) {
		if (sortingParams.isEmpty()) {
			return Command.SortDir.ASC;
		}

		try {
			return Command.SortDir.valueOf(sortingParams.get(1));
		} catch (final Exception e) {
			System.err.printf("Sorting dir is not specified. Default: [%s]%n", Command.SortDir.ASC);
			return Command.SortDir.ASC;
		}
	}

	private ToDoItem buildToDoItem(final Command.Type commandType, final Map<String, String> parametersMap) {
		final ToDoItem toDoItem = new ToDoItem();
		Optional.ofNullable(parametersMap.get(ToDoItem.Field.NAME.name()))
				.ifPresent(toDoItem::setName);

		Optional.ofNullable(parametersMap.get(ToDoItem.Field.DESCRIPTION.name()))
				.ifPresent(toDoItem::setDescription);

		Optional.ofNullable(parametersMap.get(ToDoItem.Field.DEADLINE.name()))
				.ifPresent(deadline -> toDoItem.setDeadline(LocalDateTime.parse(deadline, ToDoItem.DATE_FORMAT)));

		Optional.ofNullable(parametersMap.get(ToDoItem.Field.PRIORITY.name()))
				.ifPresent(priority -> toDoItem.setPriority(Integer.valueOf(priority)));

		Optional.of(commandType)
				.filter(Command.Type.COMPLETED::equals)
				.ifPresent(completed -> toDoItem.setStatus(ToDoItem.Status.COMPLETED));

		return toDoItem;
	}
}