package wzorceProjektowe.FactoryAbstract_Fabryka.FactoryOne.factory;

import wzorceProjektowe.FactoryAbstract_Fabryka.FactoryOne.button.Button;
import wzorceProjektowe.FactoryAbstract_Fabryka.FactoryOne.button.MacButton;
import wzorceProjektowe.FactoryAbstract_Fabryka.FactoryOne.window.MacWindow;
import wzorceProjektowe.FactoryAbstract_Fabryka.FactoryOne.window.Window;

// ConcreteFactory – implementuje AbstractFactory, tworząc konkretne obiekty (np. WindowsFactory, MacFactory)
public class MacFactory implements GUIFactory {
	public Button createButton() {
		return new MacButton();
	}

	public Window createWindow() {
		return new MacWindow();
	}
}