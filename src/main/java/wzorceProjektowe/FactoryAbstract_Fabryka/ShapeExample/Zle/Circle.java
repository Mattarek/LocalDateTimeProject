package wzorceProjektowe.FactoryAbstract_Fabryka.ShapeExample.Zle;

public class Circle {
	private int r;

	public int getR() {
		return r;
	}

	public void setR(final int r) {
		this.r = r;
	}

	public void draw() {
		System.out.println("Drawing circle with: " + r);
	}
}
