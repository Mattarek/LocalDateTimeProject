package wzorceProjektowe.FactoryAbstract_Fabryka.FactoryOne.factory;

import wzorceProjektowe.FactoryAbstract_Fabryka.FactoryOne.button.Button;
import wzorceProjektowe.FactoryAbstract_Fabryka.FactoryOne.button.WindowsButton;
import wzorceProjektowe.FactoryAbstract_Fabryka.FactoryOne.window.Window;
import wzorceProjektowe.FactoryAbstract_Fabryka.FactoryOne.window.WindowsWindow;

// ConcreteFactory – implementuje AbstractFactory, tworząc konkretne obiekty (np. WindowsFactory, MacFactory)
public class WindowsFactory implements GUIFactory {
	public Button createButton() {
		return new WindowsButton();
	}

	public Window createWindow() {
		return new WindowsWindow();
	}
}