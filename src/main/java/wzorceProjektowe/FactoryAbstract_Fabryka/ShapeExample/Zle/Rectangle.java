package wzorceProjektowe.FactoryAbstract_Fabryka.ShapeExample.Zle;

public class Rectangle {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(final int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(final int y) {
		this.y = y;
	}

	public void draw() {
		System.out.println("Drawing rectangle with " + x + " and " + y);
	}
}
