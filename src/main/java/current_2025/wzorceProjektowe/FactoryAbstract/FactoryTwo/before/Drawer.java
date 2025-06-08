package current_2025.wzorceProjektowe.FactoryAbstract.FactoryTwo.before;

import old_2024.RandomExample.RandomExample;
import org.w3c.dom.css.Rect;

public class Drawer {
	public static void main(final String[] args) {
		final Circle cirlee = new Circle();
		cirlee.setR(5);
		cirlee.draw();

		final Rectangle rectangle = new Rectangle();
		rectangle.setX(10);
		rectangle.setY(12);
		rectangle.draw();
	}
}
