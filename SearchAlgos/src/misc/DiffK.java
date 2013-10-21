package misc;

import java.util.HashMap;

public class DiffK {

	//Given a list of N numbers, find the number of number pairs whose difference is K 
	
	public int findKPairs(int[] nums, int k){
		int numPairs = 0; 
		
		for (int n=0; n<nums.length; n++){
			for (int p=n+1; p<nums.length; p++){
				if ((nums[n]-nums[p] == k) || (nums[n]-nums[p] == k*-1)){
					numPairs++; 
				}
			}
		}
		
		return numPairs;
	}
	
	public int findKPairs2(int [] nums, int k){
		int numPairs = 0; 
		HashMap<Integer, Boolean> mapNums = new HashMap<Integer, Boolean>(); 
		
		for (int n : nums){
			Integer curr = new Integer(n); 
			if (!mapNums.containsKey(curr)){
				mapNums.put(curr, new Boolean(true)); 
			}
		}
		
		for (int n : nums){
			int toFind = n - k; 
			if (toFind < 0){
				toFind = toFind * -1; 
			}
			if (mapNums.containsKey(toFind) && toFind != n){
				numPairs++; 
			}
			
		}
		
		return numPairs; 
	}
	
	public static void main (String args[]){
		
		int[] test1= {1, 3, 2, 5}; 
		DiffK d = new DiffK(); 
		
		System.out.println(d.findKPairs2(test1, 2)); 
		
		
	}
	
}
