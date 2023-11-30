package Todo1;

import java.util.Collection;

public interface DaoInterface<T, K> {
	Collection<T> getAll();
	
	T getOne(K k);
	
	void create(T t);
	
	void delete(K k);
	
	void update(T t);
}
