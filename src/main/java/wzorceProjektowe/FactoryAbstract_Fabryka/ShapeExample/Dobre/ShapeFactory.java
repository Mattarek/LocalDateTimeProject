package wzorceProjektowe.FactoryAbstract_Fabryka.ShapeExample.Dobre;

public class ShapeFactory {
	public static Shape getShape(final ShapeType type) {
		switch (type) {
			case CIRCLE:
				final Circle circle = new Circle();
				circle.setR(5);
				return circle;
			case RECTANGLE:
				final Rectangle rectangle = new Rectangle();
				rectangle.setX(10);
				rectangle.setY(12);
				return rectangle;
			default:
				return () -> System.out.println("Drawing default shape.");
		}
	}
}
