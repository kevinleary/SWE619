import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestStack {
	
	private Stack s = new Stack();
//	private Stack s1 = new Stack();
//	private Stack s2 = new Stack();
//	private Stack s3 = new Stack();
	
	private Stack sPrime = new Stack();
	
	private Object[] stuff = new Object[];
//	private Stack sCollection = new Stack(stuff);
//	private Stack[] oStuff = new Stack[] {s}; 
	
	@Before
	public void setUp() {
	
		s.push("cat");
		s.push("dog");
		
		sPrime.push("cat");
		
	}
	
	@Test
	void TestStack1() {
		assertEquals("Stack is ", s.pop(), sPrime);
		System.out.println("Stack is " + s);
	}
	
}
