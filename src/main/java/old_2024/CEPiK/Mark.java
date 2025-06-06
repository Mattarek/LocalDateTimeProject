package old_2024.CEPiK;

public enum Mark {
	OPEL(new Model[]{
			Model.INSIGNIA,
			Model.ASTRA,
			Model.ZAFIRA,
			Model.VIVARO,
			Model.MOVANO,
			Model.CORSA
	}),
	BMW(new Model[]{
			Model.X5,
			Model.M3,
			Model.SERIES_7
	}),
	AUDI(new Model[]{
			Model.A4,
			Model.A6,
			Model.Q7
	}),
	MERCEDES(new Model[]{
			Model.C_CLASS,
			Model.E_CLASS,
			Model.S_CLASS
	}),
	VOLKSWAGEN(new Model[]{
			Model.GOLF,
			Model.PASSAT,
			Model.TIGUAN
	}),
	TOYOTA(new Model[]{
			Model.COROLLA,
			Model.YARIS,
			Model.CAMRY
	}),
	HONDA(new Model[]{
			Model.CIVIC,
			Model.ACCORD,
			Model.CR_V
	});

	private final Model[] models;

	Mark(final Model[] models) {
		this.models = models;
	}

	public Model[] getModels() {
		return models;
	}
}
