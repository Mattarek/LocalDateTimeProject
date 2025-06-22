package current_2025.FunctionalProgrammingAndGenerics.order;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OrderProcessor<T> {

	public List<T> filter(final List<T> orders, final Predicate<T> condition) {
		return orders.stream()
				.filter(condition)

				.collect(Collectors.toList());
	}

	public <R> List<R> transform(final List<T> orders, final Function<T, R> mapper) {
		return orders.stream()
				.map(mapper)
				.collect(Collectors.toList());
	}

	public void forEach(final List<T> orders, final Consumer<T> action) {
		orders.forEach(action);
	}
}
