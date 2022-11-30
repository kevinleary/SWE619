import java.util.Collection;

public class InstrumentedCollection<E> extends ForwardingCollection<E> {
	
	private int addCount = 0;

	public InstrumentedCollection(Collection<E> c) {
		super(c);
	}

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	public int getAddCount() {
		return addCount;
	}
}

