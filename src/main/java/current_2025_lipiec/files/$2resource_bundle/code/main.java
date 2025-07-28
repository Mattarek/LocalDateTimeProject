package current_2025_lipiec.files.$2resource_bundle.code;

import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class main {
	public static void main(final String[] args) {
		// Najpierw szuka naszego Store, a dopiero później w Locale.GERMAN, jeśli
		//	Błąd nr.1:  Can't find bundle for base name Stoere, locale de - przy zmianie na "Stoere", wyrzuca błąd, bo
		//	nie ma takiego Store w resources.
		//  Błąd nr.2: Can't find resource for bundle java.util.PropertyResourceBundle, key mainPagee - nie mamy
		//  klucza mainPagee

		//		Szukamy pliku Co się dzieje pod spodem?
		//		1. Store_en_US.java Szukamy podanego pliku
		//		2. Store_en_US.properties Szukamy podanego pliku
		//		3. Store_en.java Jeżeli pliku wyżej nie ma, szukamy pliku tylko z językiem, bez kraju
		//		4. Store_en.properties Jeżeli pliku wyżej nie ma, szukamy pliku tylko z językiem, bez kraju
		//		5. Store_pl_PL.java Jeżeli pliku wyżej nie ma, szukamy defaultowego Locale
		//		6. Store_pl_PL.properties Jeżeli pliku wyżej nie ma, szukamy defaultowego Locale
		//		7. Store_pl.java Jeżeli pliku wyżej nie ma, szukamy defaultowego Locale, ale bez kraju
		//		8. Store_pl.properties Jeżeli pliku wyżej nie ma, szukamy defaultowego Locale, ale bez kraju
		//		9. Store.java Jeżeli pliku wyżej nie ma, szukamy pliku bez Locale
		//		10. Store.properties Jeżeli pliku wyżej nie ma, szukamy pliku bez Locale
		//		11. Jeżeli nie znaleziono żadnego pliku to zostaje wyrzuconeMissingResourceException

		// Przypadek skrajny, gdy w Store_en.properties nie mamy footer, to nie przejdzie do Store_pl.properties,
		// tylko od razu zacznie szukać w Store.properties:
		//		final ResourceBundle resourceBundle = ResourceBundle.getBundle("Store", new Locale("en", "US"));
		//		final String footer = resourceBundle.getString("footer");
		//		System.out.println(footer); // {defaultProperty=Default Value, mainPage=Strona G?ówna, footer=Stopka}

		//		final Map<String, String> collect = resourceBundle.keySet().stream()
		//				.collect(Collectors.toMap(key -> key, resourceBundle::getString));

	}
	// Resource bundle
}
