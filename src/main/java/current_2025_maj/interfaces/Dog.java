package current_2025_maj.interfaces;

public class Dog implements Animal {

	@Override
	public void fooo() {
		System.out.println("Foo is here");
	}

	@Override
	public void makeNoise() {
		System.out.println("Make noise");
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating kibble.");
	}
}
