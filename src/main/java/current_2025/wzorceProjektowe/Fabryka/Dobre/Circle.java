package current_2025.wzorceProjektowe.Fabryka.Dobre;

public class Circle implements Shape {

	private int r;

	public int getR() {
		return r;
	}

	public void setR(final int r) {
		this.r = r;
	}

	public void draw() {
		System.out.println("Drawing circle with " + r);
	}
}
