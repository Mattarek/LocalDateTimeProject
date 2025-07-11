package wzorceProjektowe.FactoryAbstract_Fabryka.FactoryOne;

import wzorceProjektowe.FactoryAbstract_Fabryka.FactoryOne.button.Button;
import wzorceProjektowe.FactoryAbstract_Fabryka.FactoryOne.factory.GUIFactory;
import wzorceProjektowe.FactoryAbstract_Fabryka.FactoryOne.factory.MacFactory;
import wzorceProjektowe.FactoryAbstract_Fabryka.FactoryOne.factory.WindowsFactory;
import wzorceProjektowe.FactoryAbstract_Fabryka.FactoryOne.window.Window;

// Client - korzysta tylko z AbstractFactory i AbstractProduct, bez znajomości klas szczegółowych
public class Application {
	private final Button button;
	private final Window window;

	public Application(final GUIFactory factory) {
		button = factory.createButton();
		window = factory.createWindow();
	}

	public static void main() {
		final GUIFactory factory;
		final String os = System.getProperty("os.name").toLowerCase();
		if (os.contains("win")) {
			factory = new WindowsFactory();
		} else {
			factory = new MacFactory();
		}

		final Application app = new Application(factory);
		app.run();
	}

	public void run() {
		window.open();
		button.render();
	}
}
