package misc;

import java.util.ArrayList;

public class PrimeNums {

	//Use Sieve of Erastosthenes to find prime numbers under x
	// http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes

	
	public static void findPrimes(int maxPrime){
		
		ArrayList<Integer> allNums = new ArrayList<Integer>(); 
		for (int i=0; i<maxPrime; i++){
			allNums.add(i);
		}
		
		int p = 2 ;
		
		while (p < maxPrime){
			for (int i=allNums.indexOf(p)+1; i<maxPrime; i++){
				if (allNums.get(i) % p == 0){
					allNums.set(i, -1); 
				}
			}
			
			int c = allNums.indexOf(p)+1;
			while (c < maxPrime && allNums.get(c) == -1){
				c++; 
				
			}
			if (c < maxPrime){
				p = allNums.get(c);
			}
			else {
				p = maxPrime; 
			}
		}
		
		
		for (int i=0; i<maxPrime; i++){
			if (allNums.get(i) != -1){
				System.out.println("Prime: " + allNums.get(i));
			}
		}
		
	}
	
	public static void main (String args[]){
		PrimeNums.findPrimes(20);
	}
}
