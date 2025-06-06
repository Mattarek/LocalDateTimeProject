package old_2024.streamsExample.UserManagement.src.repository;

import java.util.List;

public interface CrudRepository<T> {
	void save(T item);

	void delete(int id);

	T findById(int id);

	List<T> findAll();
}
