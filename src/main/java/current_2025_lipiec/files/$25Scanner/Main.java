package current_2025_lipiec.files.$25Scanner;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(final String[] args) throws FileNotFoundException {
		//		final Scanner scanner = new Scanner(System.in);
		//		System.out.println("Enter some data");
		//
		//		while (scanner.hasNext()) { // jesli mamy kolejny element, to wykonaj
		//			final String line = scanner.nextLine();
		//			System.out.println("Entered: " + line);
		//
		//			if ("done".equals(line)) {
		//			}
		//		}

		final Scanner myScanner = new Scanner(new BufferedInputStream(new FileInputStream("src/main/java" +
				"/current_2025_lipiec/files/$25Scanner/t.txt")));
		while (myScanner.hasNext()) {
			System.out.println("Value: " + myScanner.next());
		}
	}
}
