package org.Exceptions.constructors;

public class Man extends Person {

	private final String favoriteColor;

	public Man(final int age) throws WrongAgeException {
		this(age, "yellow");
		// wartość domyślna, jeśli nie podamy favoriteColor
		// to this odpowiada ża wywołanie constructora który przyjmuje age i favoriteColor
	}

	public Man(final int age, final String favoriteColor) throws WrongAgeException {
		super(age);
		this.favoriteColor = favoriteColor;
	}
}
