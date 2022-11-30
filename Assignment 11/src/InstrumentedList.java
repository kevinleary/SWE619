import java.util.List;

public class InstrumentedList<E> extends ForwardingList<E> {
	
	private int addCount = 0;

	public InstrumentedList(List<E> s) {
		super(s);
	}

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

//	@Override
//	public boolean equals(Object o) {
//
//		return super.equals(o);
//	}


	public int getAddCount() {
		return addCount;
	}
}
