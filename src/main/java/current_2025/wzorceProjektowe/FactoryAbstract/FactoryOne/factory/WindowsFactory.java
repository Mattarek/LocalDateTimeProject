package current_2025.wzorceProjektowe.FactoryAbstract.FactoryOne.factory;

import current_2025.wzorceProjektowe.FactoryAbstract.FactoryOne.button.Button;
import current_2025.wzorceProjektowe.FactoryAbstract.FactoryOne.button.WindowsButton;
import current_2025.wzorceProjektowe.FactoryAbstract.FactoryOne.window.Window;
import current_2025.wzorceProjektowe.FactoryAbstract.FactoryOne.window.WindowsWindow;

// ConcreteFactory – implementuje AbstractFactory, tworząc konkretne obiekty (np. WindowsFactory, MacFactory)
public class WindowsFactory implements GUIFactory {
	public Button createButton() {
		return new WindowsButton();
	}

	public Window createWindow() {
		return new WindowsWindow();
	}
}