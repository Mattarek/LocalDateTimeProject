package current_2025.wzorceProjektowe.Fabryka.FactoryTwo.FactoryAbstract_Fabryka.FactoryOne.factory;

import current_2025.wzorceProjektowe.Fabryka.FactoryTwo.FactoryAbstract_Fabryka.FactoryOne.button.Button;
import current_2025.wzorceProjektowe.Fabryka.FactoryTwo.FactoryAbstract_Fabryka.FactoryOne.window.Window;

// AbstractFactory – interfejs definiujący metody tworzenia (np. createButton, createWindow)
public interface GUIFactory {
	Button createButton();

	Window createWindow();
}