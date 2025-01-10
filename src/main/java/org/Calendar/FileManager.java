package org.Calendar;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileManager {
	private static final List eventsList = new ArrayList<>();
	final Pattern patternForEvent = Pattern.compile("name='(.*?)',\\s+description='(.*?)',\\s+dateOfEvent=(.*?)\\}");

	public void saveToFile(final String fileName) throws IOException {
		final PrintWriter printWriter = new PrintWriter(new FileWriter(fileName));
		for (final Object element : eventsList) {
			printWriter.println(element);
		}
		printWriter.close();
	}

	public List<Event> loadFile(final String fileName) throws IOException {
		final List<String> lines = Files.readAllLines(Path.of(fileName));
		eventsList.clear();
		for (final String line : lines) {
			final Matcher matcher = patternForEvent.matcher(line);
			if (matcher.find()) {
				final String nameValue = matcher.group(1);
				final String descriptionValue = matcher.group(2);
				final String dateOfEventValue = matcher.group(3);
				final LocalDateTime parseDateOfEventValue = LocalDateTime.parse(dateOfEventValue);
				eventsList.add(new Event(nameValue, descriptionValue, parseDateOfEventValue));
			}
		}
		return eventsList;
	}
}
