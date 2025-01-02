package org.MathExamples;

public class MatureExample {

	// Pole koła
	public static double circleArea(final double radius) {
		return Math.PI * Math.pow(radius, 2);
	}

	// Calculating the circumference
	public static double circleCircumference(final double radius) {
		return Math.PI * radius * 2;
	}

	// Calculating the area of a triangle
	public static double triangleArea(final double a, final double b, final double c) {
		final double semiPerimeter = (a + b + c) / 2;
		return Math.sqrt(semiPerimeter *
				(semiPerimeter - a) *
				(semiPerimeter - b) *
				(semiPerimeter - c));
	}

	// Calculating the area of a rectangle
	public static double rectangleArea(final double length, final double width) {
		return length * width;
	}

	// Calculating the area of a trapezoid
	public static double trapezoidArea(final double a, final double b, final double height) {
		return (a + b) / 2 * height;
	}

	// Calcualting the area of a parallelogram
	public static double parallelogramArea(final double base, final double height) {
		return base * height;
	}

	// Calculating the area of a rhombus
	public static double rhombusArea(final double diagonalOne, final double diagonalTwo) {
		return diagonalOne * diagonalTwo / 2;
	}

	// Calculating the surface area of a cube
	public static double cubeSurfaceArea(final double edge) {
		return 6 * Math.pow(edge, 2);
	}

	// Calculating the volume of a cube
	public static double cubeVolume(final double edge) {
		return Math.pow(edge, 3);
	}

	// Calculating the volume of a sphere
	public static double sphereVolume(final double radius) {
		return (4 / 3) * Math.PI * Math.pow(radius, 3);
	}

	// Calculating the value of a quadratic function at a point
	public static double quadraticFunction(final double a, final double b, final double c, final double x) {
		return a * Math.pow(x, 2) + b * x + c;
	}

	// Calculating the surface area of a cyliner
	public static double cylinderSurfaceArea(final double radius, final double height) {
		return 2 * Math.PI * radius * (radius + height);
	}

	// Calculating the volume of a cylinder
	public static double cylinderVolume(final double radius, final double height) {
		return Math.PI * Math.pow(radius, 2) * height;
	}

	public static void main(final String[] args) {
		System.out.println("Circle Area: " + circleArea(5));
		System.out.println("Circle Circumference: " + circleCircumference(5));
		System.out.println("Triangle Area (Heron's Formula: " + trapezoidArea(3, 4, 5));
		System.out.println("Rectangle Area: " + rectangleArea(5, 10));
		System.out.println("Trapezoid Area: " + trapezoidArea(5, 7, 3));
		System.out.println("Parallelogram Area: " + parallelogramArea(6, 8));
		System.out.println("Rhombys Area: " + rhombusArea(5, 6));
		System.out.println("Cube Surface Area: " + cubeSurfaceArea(4));
		System.out.println("Cube Volume: " + cubeVolume(4));
		System.out.println("Sphere Volume: " + sphereVolume(6));
		System.out.println("Quadratic Function Value: " + quadraticFunction(1, -2, 1, 3));
		System.out.println("Cylinder Surface Area: " + cylinderSurfaceArea(3, 7));
		System.out.println("Cylinder Volume: " + cylinderVolume(3, 7));
	}
}
