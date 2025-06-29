package wzorceProjektowe.FactoryAbstract_Fabryka.FactoryOne.factory;

import wzorceProjektowe.FactoryAbstract_Fabryka.FactoryOne.button.Button;
import wzorceProjektowe.FactoryAbstract_Fabryka.FactoryOne.window.Window;

// AbstractFactory – interfejs definiujący metody tworzenia (np. createButton, createWindow)
public interface GUIFactory {
	Button createButton();

	Window createWindow();
}