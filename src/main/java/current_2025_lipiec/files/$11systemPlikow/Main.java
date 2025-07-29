package current_2025_lipiec.files.$11systemPlikow;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(final String[] args) throws IOException {
		final File file = new File("./src/main/java/current_2025_lipiec/files/$11systemPlikow/text.txt");
		System.out.println(file.exists());
		if (!file.exists()) {
			System.out.println("File: " + file + " not available!");
		}

		if (file.isFile()) {
			System.out.println("File: " + file + " is fine.");
			System.out.println("File.length: " + file.length());
		}

		if (file.isDirectory()) {
			System.out.println("File: " + file + " is directory.");
			for (final File listFile : file.listFiles()) {
				System.out.println("Subfile: " + listFile);
			}
		}

		System.out.println(file.getName());

		System.out.println("File createNewFile(): " + file.createNewFile());
		System.out.println("File createNewFile(): " + file.getCanonicalPath());
		file.deleteOnExit();
	}
}
