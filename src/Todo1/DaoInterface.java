package Todo1;

import java.util.Collection;

public interface DaoInterface<T, K> {
	Collection<T> getAll();
	
	T getOne(K k);
}
