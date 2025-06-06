package old_2024.StaticBlockInit;

public class Bird implements Doable {

	static {
		System.out.println("Static block Bird");
	}

	{
		System.out.println("Non static block Bird");
	}

	public Bird() {
		System.out.println("Constructor Bird called.");
	}
}
