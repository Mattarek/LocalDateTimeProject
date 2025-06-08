package current_2025.wzorceProjektowe.FactoryAbstract.FactoryOne.factory;

import current_2025.wzorceProjektowe.FactoryAbstract.FactoryOne.button.Button;
import current_2025.wzorceProjektowe.FactoryAbstract.FactoryOne.button.MacButton;
import current_2025.wzorceProjektowe.FactoryAbstract.FactoryOne.window.MacWindow;
import current_2025.wzorceProjektowe.FactoryAbstract.FactoryOne.window.Window;

// ConcreteFactory – implementuje AbstractFactory, tworząc konkretne obiekty (np. WindowsFactory, MacFactory)
public class MacFactory implements GUIFactory {
	public Button createButton() {
		return new MacButton();
	}

	public Window createWindow() {
		return new MacWindow();
	}
}