package current_2025.wzorceProjektowe.FactoryAbstract.FactoryOne;

import current_2025.wzorceProjektowe.FactoryAbstract.FactoryOne.button.Button;
import current_2025.wzorceProjektowe.FactoryAbstract.FactoryOne.factory.GUIFactory;
import current_2025.wzorceProjektowe.FactoryAbstract.FactoryOne.factory.MacFactory;
import current_2025.wzorceProjektowe.FactoryAbstract.FactoryOne.factory.WindowsFactory;
import current_2025.wzorceProjektowe.FactoryAbstract.FactoryOne.window.Window;

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
