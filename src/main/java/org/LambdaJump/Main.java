package org.LambdaJump;

public class Main {
	public static void main(final String[] args) {
		final Jumpable jumpable = new Animal();
		System.out.println(jumpable.canJump("jump", true));

		final Jumpable jumpableLambda = (string, shouldPrint) -> {
			if (shouldPrint) {
				System.out.println("Lambda canJump invoked");
			}
			return string.contains("jump");
		};

		System.out.println("Lambda1: " + jumpableLambda.canJump("jumping", false));
		System.out.println("Lambda2: " + jumpableLambda.canJump("jumping", true));
	}
}
