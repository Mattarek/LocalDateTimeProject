package streamsExample.UserManagement.src.repository;

import org.OptionalExamples.User;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRepository<T> implements CrudRepository<T> {
	protected List<T> items = new ArrayList<>();

	@Override
	public T findById(final int id) {
		return items.stream()
				.filter(item -> item instanceof User && ((User) item).getId() == id)
				.findFirst()
				.orElse(null);
	}

	@Override
	public List<T> findAll() {
		return new ArrayList<>(items);
	}
}
