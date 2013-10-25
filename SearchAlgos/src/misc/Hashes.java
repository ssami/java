package misc;

import java.util.HashMap;
import java.util.Random;

public class Hashes {

	
	
	
	public static void main(String args[]){
		HashMap<Integer, Integer> numberOfDigits= new HashMap<Integer, Integer>();
		numberOfDigits.put(new Integer(2), new Integer(2)); 
		numberOfDigits.put(new Integer(3), new Integer(2));
		numberOfDigits.put(new Integer(0), new Integer(2));
		numberOfDigits.put(new Integer(1), new Integer(2));
		numberOfDigits.put(new Integer(5), new Integer(1));
		
		
		Random r = new Random(); 
		for (int i=0; i<6; i++){
			System.out.println(r.nextInt(10)); 
		}
		
		
	}
	
}
