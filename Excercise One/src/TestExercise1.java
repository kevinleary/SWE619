import org.junit.Before;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;


public class TestExercise1 {
	private List<Integer> l = new ArrayList<Integer>();
	private List<Integer> lPrime = new ArrayList<Integer>();
//	private ListWithTail ls;
	
	@Before
	public void setUp() {
		
		lPrime.add(2);
		lPrime.add(3);
		l.add(1);
		l.add(2);
		l.add(3);
	}
	
	@Test
	public void ListWithTailTest() {
		
		assertEquals("Tail output ", ListWithTail.tail(l), lPrime);
		System.out.println(ListWithTail.tail(l));
	}
}
