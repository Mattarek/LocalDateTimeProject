package old_2024.genericsExample;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(final String[] args) {
		final List<Element<String>> list = new ArrayList<>();
		list.add(new Element("One"));
		list.add(new Element("Two"));
		list.add(new Element("Three"));
		Element.showElement(123);
		System.out.println(list);
		Name.showNumber(123);

		final IGeneric<String> repo = new GenericExample();
		repo.save("Example");
		System.out.println(repo.findById(1));
	}
}
