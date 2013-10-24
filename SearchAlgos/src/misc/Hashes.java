package misc;

import java.util.ArrayList;
import java.util.HashMap;

public class Hashes {

	
	public int lonelyNumber(ArrayList<Integer> list){
		ArrayList<Integer> seen = new ArrayList<Integer>(); 
		int expectedCount = 0; 
		int givenCount = 0; 
		for (Integer i : list){
			if (!seen.contains(i)){
				expectedCount += i.intValue()*2; 
			}
			givenCount += i.intValue(); 
		}
		
		return expectedCount - givenCount; 
	}
	
	public static void main(String args[]){
		HashMap<Integer, Integer> numberOfDigits= new HashMap<Integer, Integer>();
		numberOfDigits.put(new Integer(2), new Integer(2)); 
		numberOfDigits.put(new Integer(3), new Integer(2));
		numberOfDigits.put(new Integer(0), new Integer(2));
		numberOfDigits.put(new Integer(1), new Integer(2));
		numberOfDigits.put(new Integer(5), new Integer(1));
		
		
		
	}
	
}
