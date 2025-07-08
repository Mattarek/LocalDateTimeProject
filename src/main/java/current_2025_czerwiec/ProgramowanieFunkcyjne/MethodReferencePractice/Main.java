package current_2025_czerwiec.ProgramowanieFunkcyjne.MethodReferencePractice;

import java.util.Optional;

public class Main {
	//===================================================
	//	public static void main(final String[] args) {
	//		final Main main = new Main();
	//		final IYacht yacht = main::printModel; // jeśli nie jest static
	//		yacht.sail("Asia");
	//	}
	//
	//	private static int printModel(final String model, final String sailor) {
	//		System.out.println("Currently sailing on " + model);
	//		return 1;
	//	}
	//
	//	private int printModel(final String model) {
	//		System.out.println("Currently sailing on " + model);
	//		return 1; // zwraca inta ale nie może być do niczego przypisany, więc Java na to pozwala
	//	}

	//=================================
	public static void main(final String[] args) {
		final Optional<String> ship = Optional.of(new Ship("Opel"))
				.map(Ship::getModel);

		final Optional<Ship> shipObj = Optional.of("Titanic")
				.map(Ship::new);
	}
}
