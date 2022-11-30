import java.util.*;

public class ForwardingCollection<E> implements Collection<E> {

	private final Collection<E> c;
	
	public ForwardingCollection(Collection<E> c) {
		this.c = c;
	}
	@Override
	public boolean add(E e) {
		return c.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return false;
	}

	@Override
	public void clear() {
		c.clear();
	}

	@Override
	public boolean contains(Object o) {
		return c.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return c.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		return c.isEmpty();
	}

	@Override
	public Iterator<E> iterator() {
		return c.iterator();
	}

	@Override
	public boolean remove(Object o) {
		return c.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return c.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return c.retainAll(c);
	}

	@Override
	public int size() {
		return c.size();
	}

	@Override
	public Object[] toArray() {
		return c.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return c.toArray(a);
	}

}
