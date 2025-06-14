package megaK.PodsumowanieWildcards.CompositionInheritence.exampleOne.Composition;

public class Elephant {
	private final SoundMaker soundMaker;

	public Elephant(final SoundMaker soundMaker) {
		this.soundMaker = soundMaker;
	}

	void makeSound() {
		soundMaker.makeSound("Trumpet!");
	}
}
