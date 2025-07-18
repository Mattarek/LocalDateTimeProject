package current_2025_czerwiec.ProgramowanieFunkcyjne.Streamy.StreamsProjektKoncowy;

import java.util.Map;

public class PrintingUtils {
	public static void printingMap(final Map<?, ?> map) { // kluczem może być cokolwiek, wartością też
		map.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
	}
}
