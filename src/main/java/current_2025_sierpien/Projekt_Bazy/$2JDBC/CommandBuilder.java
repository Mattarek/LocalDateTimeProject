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
		final String commandType = split[0];

		if (!Command.Type.valuesAsList().contains(commandType)) {
			System.err.printf("User provided unknown command: [%s]%n", commandType);
			return Optional.empty();
		}

		final List<String> stringCommandWithParamsExtracted = Arrays.asList(split).subList(1, split.length);

		final Map<String, String> collect = stringCommandWithParamsExtracted.stream()
				.map(item -> item.split("="))
				.filter(paramsSplit -> ToDoItem.Field.SORT.name().equals(paramsSplit[0]))
				.collect(Collectors.toMap(itemSplit -> itemSplit[0], itemSplit -> itemSplit[1]));

		final Map<String, String> parametersMap = stringCommandWithParamsExtracted.stream()
				.map(item -> item.split("="))
				.collect(Collectors.toMap(itemSplit -> itemSplit[0], itemSplit -> itemSplit[1]));

		final List<String> sortingParams =
				Optional.ofNullable(parametersMap.get(ToDoItem.Field.SORT.name()))
						.map(params -> List.of(params.split(",")))
						.orElse(Collections.emptyList());

		final ToDoItem toDoItem = buildToDoItem(collect);
		return Optional.of(
				new Command(
						Command.Type.from(commandType),
						toDoItem,
						findSortingField(sortingParams),
						findSortingDir(sortingParams))
		);
	}

	private ToDoItem.Field findSortingField(final List<String> sortingParams) {
		if (sortingParams.isEmpty()) {
			System.out.println("Sorting params are not specified.");
			return null;
		}

		try {
			return ToDoItem.Field.valueOf(sortingParams.getFirst());
		} catch (final Exception e) {
			System.out.printf("Sorting field is not specified. Default: [%s$]%n", ToDoItem.Field.NAME);
			return ToDoItem.Field.NAME;
		}
	}

	private Command.SortDir findSortingDir(final List<String> sortingParams) {
		if (sortingParams.isEmpty()) {
			System.out.println("Sorting params are not specified.");
			return null;
		}

		try {
			return Command.SortDir.valueOf(sortingParams.get(1));
		} catch (final Exception e) {
			System.err.printf("Sorting dir is not specified. Default: [%s$]%n", Command.SortDir.ASC);
			return Command.SortDir.ASC;
		}
	}

	private ToDoItem buildToDoItem(final Map<String, String> collect) {
		final ToDoItem toDoItem = new ToDoItem();
		Optional.ofNullable(collect.get(ToDoItem.Field.NAME.name())).ifPresent(toDoItem::setName);
		Optional.ofNullable(collect.get(ToDoItem.Field.DESCRIPTION.name())).ifPresent(toDoItem::setDescription);
		Optional.ofNullable(collect.get(ToDoItem.Field.DEADLINE.name()))
				.ifPresent(deadline -> toDoItem.setDeadline(LocalDateTime.parse(deadline, ToDoItem.DATE_FORMAT)));
		Optional.ofNullable(collect.get(ToDoItem.Field.PRIORITY.name()))
				.ifPresent(priority -> toDoItem.setPriority(Integer.valueOf(priority)));

		return toDoItem;
	}
}
