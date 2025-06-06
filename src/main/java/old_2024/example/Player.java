package old_2024.example;

public class Player {
	private final Inventory inventory;
	private Item itemInHand;
	private int health;
	private int gold;
	private Location location;
	private int level;
	private int experience;

	public Player(final int health, final int gold, final int inventorySize, final double maxInventoryWeight, final Location location) {
		setHealth(health);
		setGold(gold);
		inventory = new Inventory(inventorySize, maxInventoryWeight);
		itemInHand = null;
		setLocation(location);
		level = 1;
		experience = 0;
	}

	public void attack(final Enums enems) {
		if (enems == null || enems.isDefeated()) {
			System.out.println("Brak przeciwnika do zaatakowania.");
			return;
		}

		final int damage = itemInHand != null ? itemInHand.getValue() : 10; // Domyślna siła ataku: 10
		enems.takeDamage(damage);
		System.out.println("Gracz zadał " + damage + " obrażeń!");
		if (enems.isDefeated()) {
			gainExperience(50);
			System.out.println("Przeciwnik został pokonany!");
		}
	}

	public void setHealth(final int health) {
		if (health < 0 || health > 100) {
			throw new IllegalArgumentException("Życie musi być w zakresie od 0 do 100.");
		}
		this.health = health;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(final int gold) {
		if (gold < 0) {
			throw new IllegalArgumentException("Złoto nie może być ujemne.");
		}
		this.gold = gold;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setItemInHand(final Item itemInHand) {
		this.itemInHand = itemInHand;
	}

	public void defend(final Enums enums) {
		if (enums == null || enums.isDefeated()) {
			System.out.println("Brak przeciwnika do obrony.");
			return;
		}
		final int damage = Math.max(0, enums.getAttackPower() - 5); // Obrona zmniejsza obrażenia o 5
		setHealth(health - damage);
		System.out.println("Gracz zablokował część ataku, otrzymał " + damage + " obrażeń.");
	}

	private void gainExperience(final int xp) {
		experience += xp;
		System.out.println("Zdobyto " + xp + " punktów doświadczenia.");
		while (experience >= level * 100) {
			experience -= level * 100;
			level++;
			System.out.println("Awans! Nowy poziom: " + level);
		}
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(final Location location) {
		if (location == null) {
			throw new IllegalArgumentException("Lokalizacja nie może być null.");
		}
		this.location = location;
	}
}