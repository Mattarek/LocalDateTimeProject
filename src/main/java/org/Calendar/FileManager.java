package org.Calendar;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

	public void saveToFile(final String fileName, final List<Event> eventsList) throws IOException {
		final Path path = Path.of(fileName);

		if (!Files.exists(path)) {
			Files.createFile(path);
		}

		final String content = Files.readString(path).trim();
		if (content.isEmpty()) {
			Files.writeString(path, "[]");
		}

		final JSONArray jsonArray = new JSONArray();

		for (final Event event : eventsList) {
			final JSONObject jsonObject = new JSONObject();
			jsonObject.put("name", event.getName());
			jsonObject.put("description", event.getDescription());
			jsonObject.put("dateOfEvent", event.getDateOfEvent());
			jsonArray.put(jsonObject);
		}

		try (final PrintWriter printWriter = new PrintWriter(fileName)) {
			printWriter.write(jsonArray.toString(4));
		}
	}

	public List<Event> loadFile(final String fileName) throws IOException {
		final List eventsList = new ArrayList<>();
		final String content = Files.readString(Path.of(fileName));

		if (content.isEmpty()) {
			Files.writeString(Path.of(fileName), "[]");
		}

		final JSONArray jsonArray = new JSONArray(content);
		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			final JSONObject jsonObject = jsonArray.getJSONObject(i);
			final String name = jsonObject.getString("name");
			final String description = jsonObject.getString("description");
			final LocalDateTime dateOfEvent = LocalDateTime.parse(jsonObject.getString("dateOfEvent"));

			eventsList.add(new Event(name, description, dateOfEvent));
		}
		return eventsList;
	}
}
