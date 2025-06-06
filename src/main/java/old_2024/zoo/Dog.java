package old_2024.zoo;

public class Dog extends Animal {

	public static int howManyDogsWeHaveInOurProgram;
	private final String name;

	public Dog(final String name) {
		this.name = name;
		howManyDogsWeHaveInOurProgram++;
	}

	public void exampleBehaviour() {
		super.exampleBehaviour();
	}
}
