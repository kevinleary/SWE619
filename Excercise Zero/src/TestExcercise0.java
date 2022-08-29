import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class TestExcercise0 {
	private User x,y,z; 
	private SpecialUser xPrime,yPrime,zPrime;
	
	@Before
	public void setUp() {
		x = new User("Kevin");
		y = new User("John");
		z = new User("Kevin");
		
		xPrime = new SpecialUser("Kevin", 8);
		yPrime = new SpecialUser("John", 9);
		zPrime = new SpecialUser("Kevin", 10);
	}
	
	
	@Test
	public void UserTest() {
//		fail("Not yet implemented");
//		x.equals(y);
		
		assertEquals("x == y", x.equals(y), false);
		System.out.println("x == y is " + x.equals(y));
		assertEquals("y == x", y.equals(x), false);
		System.out.println("y == x is " + x.equals(y));
		assertEquals("x == z", x.equals(z), true);
		System.out.println("x == z is " + x.equals(z));
		
	}
	
	@Test
	public void SpecialUserTest() {
		
		assertEquals("xPrime == yPrime", xPrime.equals(yPrime), false);
		System.out.println("xPrime == yPrime is " + x.equals(y));
		assertEquals("yPrime == xPrime", yPrime.equals(xPrime), false);
		System.out.println("yPrime == xPrime is " + x.equals(y));
		assertEquals("xPrime == zPrime", xPrime.equals(zPrime), false);
		System.out.println("xPrime == zPrime is " + xPrime.equals(zPrime));
		//SpecialUser and User equals() does not consider inheritance
		assertEquals("x == xPrime", x.equals(xPrime), true);
		System.out.println("x == xPrime is " + x.equals(xPrime));
		
	}

}
