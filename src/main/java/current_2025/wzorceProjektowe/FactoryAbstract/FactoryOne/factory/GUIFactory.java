package current_2025.wzorceProjektowe.FactoryAbstract.FactoryOne.factory;

import current_2025.wzorceProjektowe.FactoryAbstract.FactoryOne.button.Button;
import current_2025.wzorceProjektowe.FactoryAbstract.FactoryOne.window.Window;

// AbstractFactory – interfejs definiujący metody tworzenia (np. createButton, createWindow)
public interface GUIFactory {
	Button createButton();

	Window createWindow();
}