package current_2025_lipiec.files.$30ProjektKoncowy;

import current_2025_lipiec.files.$30ProjektKoncowy.domain.Purchase;
import current_2025_lipiec.files.$30ProjektKoncowy.services.FileService;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
	static void main() {
		final Path path = Paths.get("./src/main/java/current_2025_lipiec/files/$30ProjektKoncowy/resources/client-car-purchase-spreadsheet.csv");
		final List<Purchase> purchaseList = FileService.loadData(path);
		if (purchaseList == null) {
			return;
		}
		for (final Purchase p : purchaseList) {
			System.out.println(p);
		}
	}
}
