package current_2025.wzorceProjektowe.PrototypeGPT;

public class Main {
	public static void main(final String[] args) {
		// Tworzymy prototyp
		final ConcretePrototype original = new ConcretePrototype("Wersja oryginalna");

		final ConcretePrototype copy = original.copy();

		copy.setData("Zmieniona wersja kopii");

		System.out.println("Oryginał: " + original.getData());
		System.out.println("Kopia: " + copy.getData());

		System.out.println("Czy to ta sama instancja: " + (original == copy));
	}
}
