package old_2024.streamsExample.UserManagement.src.repository;

import old_2024.OptionalExamples.User;

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
