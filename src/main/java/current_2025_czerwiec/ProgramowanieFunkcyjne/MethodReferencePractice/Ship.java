package current_2025_czerwiec.ProgramowanieFunkcyjne.MethodReferencePractice;

import java.util.Optional;

public class Ship {
	private final String model;

	public Ship(final String model) {
		this.model = model;
	}

	public Ship(final Integer model) {
		this.model = model.toString();
	}

	public String getModel() {
		return model;
	}
}
