package SOLID.L;

public class Square extends Rectangle {
	private int height;
	private int width;

	public Square(final int height, final int width) {
		super(height, width);
		this.height = height;
		this.width = width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	public void setHeight(final int height) {
		width = height;
		this.height = height;
	}

	@Override
	public int getWidth() {
		return width;
	}

	public void setWidth(final int width) {
		this.width = width;
		height = height;
	}
}
