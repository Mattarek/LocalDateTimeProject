package old_2024.genericsExample;

public class GenericExample implements IGeneric {
	@Override
	public void save(final Object item) {
		System.out.println("Zapisano: " + item);
	}

	@Override
	public Object findById(final int id) {
		return "Element-" + id;
	}
}
