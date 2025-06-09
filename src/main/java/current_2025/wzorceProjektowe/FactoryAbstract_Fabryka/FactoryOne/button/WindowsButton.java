package current_2025.wzorceProjektowe.Fabryka.FactoryTwo.FactoryAbstract_Fabryka.FactoryOne.button;

// ConcreteProduct – konkretna implementacja produktu (np. WindowsButton, MacButton)
public class WindowsButton implements Button {
	public void render() {
		System.out.println("Renderuję przycisk Windows.");
	}
}
