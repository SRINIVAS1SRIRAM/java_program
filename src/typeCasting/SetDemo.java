package typeCasting;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		LinkedHashSet lhs = new LinkedHashSet();
		TreeSet ts = new TreeSet();
		
		hs.add("abc");
		hs.add("scd");
		hs.add("bcd");
		
		lhs.add("abc");
		lhs.add("scd");
		lhs.add("bcd");
	
		ts.add("abc");
		ts.add("scd");
		ts.add("bcd");
		
		System.out.println("hashset " + hs);
		System.out.println("linkedhashset " + lhs);
		System.out.println("treeset " + ts);
	
	}

}
