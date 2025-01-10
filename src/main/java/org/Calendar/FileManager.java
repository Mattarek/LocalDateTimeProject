package org.Calendar;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileManager {
	public static void saveToFile(final List<Event> eventsList, final String fileName) throws IOException {
		final PrintWriter printWriter = new PrintWriter(new FileWriter(fileName));
		for (final Object element : eventsList) {
			printWriter.println(element);
		}
		printWriter.close();
	}

	public static boolean loadFile(final List<Event> eventsList, final String fileName) throws IOException {
		final List<String> lines = Files.readAllLines(Path.of(fileName));
		eventsList.clear();
		boolean foundMatch = false;
		for (final String line : lines) {
			final Pattern pattern = Pattern.compile("name='(.*?)',\\s+description='(.*?)',\\s+dateOfEvent=(.*?)\\}");
			final Matcher matcher = pattern.matcher(line);

			if (matcher.find()) {
				final String nameValue = matcher.group(1);
				final String descriptionValue = matcher.group(2);
				final String dateOfEventValue = matcher.group(3);
				final LocalDateTime parseDateOfEventValue = LocalDateTime.parse(dateOfEventValue);
				foundMatch = true;
				eventsList.add(new Event(nameValue, descriptionValue, parseDateOfEventValue));
			}
		}
		return foundMatch;
	}
}
