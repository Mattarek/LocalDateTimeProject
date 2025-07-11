package SOLID.L;

public class Rectangle {
	private int width;
	private int height;

	public Rectangle(final int height, final int width) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(final int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(final int height) {
		this.height = height;
	}
}
