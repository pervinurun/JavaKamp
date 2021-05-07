package gamerController.abstracts;

public interface BaseService<T> {
	void add(T entity);
	void update(T entity);
	void delete(T entity);

}
