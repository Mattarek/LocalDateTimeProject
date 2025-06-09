package current_2025.wzorceProjektowe.Fabryka.FactoryTwo.FactoryAbstract_Fabryka.FactoryOne.factory;

import current_2025.wzorceProjektowe.Fabryka.FactoryTwo.FactoryAbstract_Fabryka.FactoryOne.button.Button;
import current_2025.wzorceProjektowe.Fabryka.FactoryTwo.FactoryAbstract_Fabryka.FactoryOne.button.WindowsButton;
import current_2025.wzorceProjektowe.Fabryka.FactoryTwo.FactoryAbstract_Fabryka.FactoryOne.window.Window;
import current_2025.wzorceProjektowe.Fabryka.FactoryTwo.FactoryAbstract_Fabryka.FactoryOne.window.WindowsWindow;

// ConcreteFactory – implementuje AbstractFactory, tworząc konkretne obiekty (np. WindowsFactory, MacFactory)
public class WindowsFactory implements GUIFactory {
	public Button createButton() {
		return new WindowsButton();
	}

	public Window createWindow() {
		return new WindowsWindow();
	}
}