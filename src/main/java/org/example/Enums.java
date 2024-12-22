package org.example;

public class Enums {
	private final int attackPower;
	private int health;

	public Enums(final int health, final int attackPower) {
		this.health = health;
		this.attackPower = attackPower;
	}

	public int getHealth() {
		return health;
	}

	public void takeDamage(final int damage) {
		health = Math.max(0, health - damage);
	}

	public int getAttackPower() {
		return attackPower;
	}

	public boolean isDefeated() {
		return health <= 0;
	}

	@Override
	public String toString() {
		return "Enemy{health=" + health + ", attackPower=" + attackPower + "}";
	}
}