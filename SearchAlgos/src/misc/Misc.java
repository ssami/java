package misc;

import java.util.ArrayList;

public class Misc {

	
	public boolean isPalindrome(int num){
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int div = 10; 
		
		while (num > 0){
			if (num < 10){
				numbers.add(num); 
				num = num / 10; 
				continue; 
			}
			int divis = num / div * 10; 
			int digit = num % divis;
			numbers.add(digit); 
			num = num / 10; 
		}
		
		int p = numbers.size()-1; 
		for (int i=0; i<numbers.size()/2; i++, p--){
			if (!numbers.get(i).equals(numbers.get(p))){
				return false; 
			}
		}
		
		return true; 
	}
	
	
	public static void main (String args[]){
		int[] test = {31, 0, 2345432, 90, 99, 10001, 9008009};  
		Misc m = new Misc(); 
		for (int i : test){
			System.out.println(m.isPalindrome(i));
		}
		
	}
	
}


