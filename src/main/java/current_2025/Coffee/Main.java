package current_2025.Coffee;

public class Main {
	public static void main(final String[] args) {
		final OrderManager manager = new OrderManager();

		final Order o1 = manager.createOrder();
		o1.addCoffee(new Coffee(CoffeeType.ESPRESSO, Size.SMALL));
		o1.addCoffee(new Coffee(CoffeeType.LATTE, Size.LARGE));

		final Order o2 = manager.createOrder();
		o2.addCoffee(new Coffee(CoffeeType.AMERICANO, Size.MEDIUM));

		manager.printAllOrders();
	}
}
