package megaK.DesignPattarens.Factory;

public class Pepperoni implements Pizza {

	@Override
	public String whatSauce() {
		return "Spicy";
	}

	@Override
	public void bake() {
		System.out.println("I'm soo baking!");
	}

	public void beMoreSpicy() {
		System.out.println("be more spicy");
	}
}
