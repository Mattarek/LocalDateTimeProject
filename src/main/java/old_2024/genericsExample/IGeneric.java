package old_2024.genericsExample;

public interface IGeneric<T> {
	void save(T item);

	T findById(int id);
}
