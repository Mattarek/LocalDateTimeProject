package current_2025.tests;

public class Outside {
	private final String text = "To jest pole klasy zewnętrznej";

	public static void main(final String[] args) {
		Outside.StaticInnerClass.show();
		final Outside o = new Outside();
		o.showText();
	}

	public void showText() {
		System.out.println(text);
	}

	public static class StaticInnerClass {
		public static void show() {
			System.out.println("To jest metoda klasy statycznej wewnętrznej");
		}
	}
}
