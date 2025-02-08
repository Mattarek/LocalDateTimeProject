package org.LambdaJump;

@FunctionalInterface // dodajemy aby nad pilnowało, ze ma być tylko jedna metoda
public interface Jumpable {
	boolean canJump(String s, boolean b);
}
