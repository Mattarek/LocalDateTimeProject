package current_2025.wzorceProjektowe.Fabryka.Dobre;

public class Drawer {
	public static void main(final String[] args) {
		final Shape shape = ShapeFactory.getShape(ShapeType.CIRCLE);
		shape.draw();
	}
}
