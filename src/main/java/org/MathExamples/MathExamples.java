package org.MathExamples;

public class MathExamples {

	public static void main(final String[] args) {
		System.out.println("getAboluteValue: " + getAboluteValue(-5));
		System.out.println("getHigherValue: " + getHigherValue(5, 10));
		System.out.println("getLowerValue: " + getLowerValue(2, 8));
		System.out.println("getPowValue: " + getPowValue(2, 3));
		System.out.println("getSquareRoot: " + getSquareRoot(16));
		System.out.println("getCbrt: " + getCbrt(64));
		System.out.println("getRoundedValue: " + getRoundedValue(2.3));
	}

	public static int getAboluteValue(final int value) {
		return Math.abs(value);
	}

	public static int getHigherValue(final int valueOne, final int valueTwo) {
		return Math.max(valueOne, valueTwo);
	}

	public static int getLowerValue(final int valueOne, final int valueTwo) {
		return Math.min(valueOne, valueTwo);
	}

	public static double getPowValue(final int valueOne, final int valueTwo) {
		return Math.pow(valueOne, valueTwo);
	}

	public static double getSquareRoot(final double value) {
		return Math.sqrt(value);
	}

	public static double getCbrt(final double value) {
		return Math.cbrt(value);
	}

	public static double getRoundedValue(final double value) {
		return Math.round(value);
	}
}
