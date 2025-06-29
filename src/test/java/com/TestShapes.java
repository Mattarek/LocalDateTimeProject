package org;

import SOLID.L.Rectangle;
import SOLID.L.Square;
import org.junit.Assert;
import org.junit.Test;

public class TestShapes {

	@Test
	public void testRectangle() {
		final Rectangle rectangle = new Rectangle(20, 40);
		rectangle.setHeight(50);
		Assert.assertEquals(40, rectangle.getHeight());
	}

	@Test
	public void testSquare() {
		final Rectangle rectangle = new Square(20, 40);
		rectangle.setHeight(50);
		Assert.assertEquals(40, rectangle.getHeight());
	}
}
