import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ForwardingList<E> implements List<E> {

	private final List<E> list;
	
	public ForwardingList(List<E> l) {
		this.list = l;
	}

	@Override
	public boolean equals(Object o) {
		return list.equals(o);
	}
	
	@Override
	public boolean add(E arg0) {
		return list.add(arg0);
	}

	@Override
	public void add(int arg0, E arg1) {
		list.add(arg0, arg1);
	}

	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		return list.addAll(arg0);
	}

	@Override
	public boolean addAll(int arg0, Collection<? extends E> arg1) {
		return list.addAll(arg0, arg1);
	}

	@Override
	public void clear() {
		list.clear();
	}

	@Override
	public boolean contains(Object arg0) {
		return list.contains(arg0);
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		return list.contains(arg0);
	}

	@Override
	public E get(int arg0) {
		return list.get(arg0);
	}

	@Override
	public int indexOf(Object arg0) {
		return list.indexOf(arg0);
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public Iterator<E> iterator() {
		return list.iterator();
	}

	@Override
	public int lastIndexOf(Object arg0) {
		return list.lastIndexOf(arg0);
	}

	@Override
	public ListIterator<E> listIterator() {
		return list.listIterator();
	}

	@Override
	public ListIterator<E> listIterator(int arg0) {
		return list.listIterator(arg0);
	}

	@Override
	public boolean remove(Object arg0) {
		return list.remove(arg0);
	}

	@Override
	public E remove(int arg0) {
		return list.remove(arg0);
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		return list.removeAll(arg0);
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		return list.retainAll(arg0);
	}

	@Override
	public E set(int arg0, E arg1) {
		return list.set(arg0,  arg1);
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public List<E> subList(int arg0, int arg1) {
		return list.subList(arg0, arg1);
	}

	@Override
	public Object[] toArray() {
		return list.toArray();
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		return list.toArray(arg0);
	}
}
