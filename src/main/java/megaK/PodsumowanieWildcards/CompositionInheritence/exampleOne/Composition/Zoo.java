package megaK.PodsumowanieWildcards.CompositionInheritence.exampleOne.Composition;

public class Zoo {

	public static void main(final String[] args) {
		final SoundMaker soundMaker = new SoundMaker();
		final Elephant elephant = new Elephant(soundMaker);
		elephant.makeSound();
	}
}
