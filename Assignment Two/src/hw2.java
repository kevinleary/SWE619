/**
 * SWE 619 - HW2
 * @author Kevin Leary, Karthik Vanka, John DeCarlo
 * For the second assignment, you'll build a very small piece of Java for a contract with preconditions, 
 * transform the contract so that all preconditions become postconditions, and then re-implement appropriately.
 */

public class hw2 {
	/**
	 * @param a 
	 * @param b
	 * Precondition: a not null;
	 * 				 b not null
	 * 				 There is some index i such that a[i] == b[i]
	 * Postcondition: return the first index i at which a[i] == b[i]
	 * @return
	 */
	public static int findDup(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == b[i])
				return i;
		}
		return -1;
	}
	
	/**
	 * @param a 
	 * @param b
	 * Precondition: a is not empty;
	 * 				 b is not empty;
	 * 				 the length of a and b does not need to match
	 * Postcondition: return the first index i at which a[i] == b[i]
	 * @return
	 */
	public static int findDupTransform(int[] a, int[] b) {
		if(a.length == 0 || b.length == 0) {
			return -1;
		} else {
			int array_length = 0;
			if(a.length < b.length) {
				array_length = a.length;
			} else {
				array_length = b.length;
			}
			for(int i = 0; i < array_length; i++) {
				if(a[i] == b[i])
					return i;
			}
			return -1;
		}
	}
}