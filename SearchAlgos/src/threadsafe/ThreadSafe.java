package threadsafe;

import java.util.ArrayList;
import java.util.HashMap;

public class ThreadSafe extends Thread{
	
	public void putFunc(ArrayList<Integer> aList, HashMap<Integer, Integer> countDigs){

		System.out.println("Calling putfunc");
		for (Integer i : aList){
			if (countDigs.containsKey(i)){
				Integer count = countDigs.get(i);
				countDigs.put(i, count+1); 
			}
			else{
				countDigs.put(i,  1); 
			}
		}
		
	}

	public Integer getFunc(Integer digit, HashMap<Integer, Integer> countDigs){
		
		System.out.println("Calling getfunc");
		if (countDigs.containsKey(digit)){
			return countDigs.get(digit); 
		}
		else {
			return new Integer(-1);
		}
		
	}

	
}
