package current_2025.wzorceProjektowe.PrototypeGPT;

public class ConcretePrototype implements Prototype<ConcretePrototype> {
	private String data;

	public ConcretePrototype(final String data) {
		this.data = data;
	}

	@Override
	public ConcretePrototype copy() {
		return new ConcretePrototype(data);
	}

	public String getData() {
		return data;
	}

	public void setData(final String data) {
		this.data = data;
	}
}