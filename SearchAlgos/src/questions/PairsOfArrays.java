package questions;

import java.util.ArrayList;

public class PairsOfArrays {
	
	static int count = 5; 
	
	public PairsOfArrays(int count){
		 count = 5; 
	}
	
	public static void twoArrays(ArrayList<Integer> arrA, ArrayList<Integer> arrB, Integer k){
		
		boolean hasPair = false; 
		Integer kI = new Integer(k); 
		ArrayList<Integer> rearrB = new ArrayList<Integer>(); 
		
		for (Integer i : arrA){
			for (int p=0; p<arrB.size(); p++){
				if (i+arrB.get(p) == kI || i+arrB.get(p) > kI){
					rearrB.add(arrB.get(p)); 
					arrB.remove(p);
					hasPair = true; 
					break; 
				}
				else {
					hasPair = false; 
				}
//				if (!hasPair){
//					break; 
//				}
			}
		}
		if (hasPair){
			System.out.println("YES"); 
		}
		else { 
			System.out.println("NO"); 
		}
		
	}
	
	public static void main (String args[]){
		
		ArrayList<Integer> one = new ArrayList<Integer>(); 
//		one.add(2); 
//		one.add(1); 
//		one.add(3); 
		
		ArrayList<Integer> two = new ArrayList<Integer>(); 
//		two.add(7); 
//		two.add(8); 
//		two.add(9); 
		
		one.add(1); 
		one.add(2); 
		one.add(2); 
		one.add(1);
		
		two.add(7);
		two.add(3);
		two.add(3);
		two.add(4);
		
		
		PairsOfArrays.twoArrays(one, two, new Integer(5));
		
	}

}
