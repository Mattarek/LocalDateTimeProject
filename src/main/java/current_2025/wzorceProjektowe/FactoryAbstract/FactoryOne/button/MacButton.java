package current_2025.wzorceProjektowe.FactoryAbstract.FactoryOne.button;

// ConcreteProduct – konkretna implementacja produktu (np. WindowsButton, MacButton)
public class MacButton implements Button {
	public void render() {
		System.out.println("Renderuje przycisk Mac.");
	}
}
