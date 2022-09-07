import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class hw2Test {	
	
	@Test
	void test1() {
		// Both array a and b are equal in side and have two matching indexes
		int[] a = {-1, 5, 10, 3, 4, 11};
		int[] b = {0, 1, 10, 8, 2, 5};
	}
	
	@Test
	void test2() {
		// There are two matching indexes where a[i] == b[i], we return the first one
		int[] a = {0, 7, 4, 6, 3};
		int[] b = {1, 2, 4, 6, 9};
		assertEquals("Matching index of 2", hw2.findDupTransform(a, b), 2);
	}
	
	@Test
	void testTransform1() {
		// Length of a is greater than length of b
		int[] a = {-1, 5, 10, 3, 4, 11};
		int[] b = {0, 1, 10, 8, 2, 5};
		assertEquals("Matching index of 2", hw2.findDupTransform(a, b), 2);
	}
	
	@Test
	void testTransform2() {
		// Length of b is greater than length of a
		int[] a = {-1, 0, 1, 3};
		int[] b = {0, 1, 2, 3, 4, 5};
		assertEquals("Matching index of 3", hw2.findDupTransform(a, b), 3);
	}
	
	@Test
	void testTransform3() {
		// Arrays a and b are both equal in size
		int[] a = {7, 5, 6, 4};
		int[] b = {1, 2, 6, 3};
		assertEquals("Matching index of 2", hw2.findDupTransform(a, b), 2);
	}
}