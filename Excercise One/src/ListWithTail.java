import java.util.*;

public class ListWithTail {
	
	public static List<Integer> tail (List<Integer> list) {

		// REQUIRES: ???
		// EFFECTS:  ???
		
		//Total specification ...
		
		if (list.size() == 0) {
			throw new IllegalArgumentException();
		}
			
		List<Integer> result = new ArrayList<Integer>(list);
		result.remove(0);
		return result;
	}
	
}
