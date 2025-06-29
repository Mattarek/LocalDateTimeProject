package wzorceProjektowe.FactoryAbstract_Fabryka.ShapeExample.Zle;

public class Drawer {

	public static void main(final String[] args) {
		final Circle circle = new Circle();
		circle.setR(5);
		circle.draw();

		final Rectangle rectangle = new Rectangle();
		rectangle.setX(10);
		rectangle.setX(12);
		rectangle.draw();
	}
}
