package old_2024.example;

public final class Main {
	public static void main(final String[] args) {
		final Location startLocation = new Location(0, 0);
		final Player player = new Player(100, 50, 5, 50.0, startLocation);

		final Enums goblin = new Enums(30, 15);
		System.out.println("Napotkano przeciwnika: " + goblin);

		final Item sword = new Item(20);
		player.getInventory().setItem(0, sword);
		player.setItemInHand(sword);

		System.out.println("\nRozpoczynamy walkę!");
		player.attack(goblin);
		player.defend(goblin);
	}
}