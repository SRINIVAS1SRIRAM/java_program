package typeCasting;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "1,Sri,50000");
		hm.put(2, "2,Srin,60000");
		hm.put(3, "3,Srini,70000");
		hm.put(4, "4,Sriniv,80000");
		hm.put(5, "5,Srinivas,100000");
		
		Set<Integer> i = hm.keySet();
		
		for(Integer e : i) {
			
			String getRecord = hm.get(e);
			String record[] = getRecord.split(",");
			
			System.out.print("Roll no: " + record[0]);
			System.out.print(" Name: " + record[1]);
			System.out.print(" Salary: " + record[2]);
			System.out.println();
		}
	}

}
