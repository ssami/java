import java.util.ArrayList;


public class BubbleSort {
	
	//Compares pairs of adjacent items through each pass of the array to 
	//sort it
	
	public ArrayList<Integer> bubbleSort(ArrayList<Integer> origArray){
		
		boolean swap = false; 
		
		do{
			swap = false; 
			for (int i=0; i<origArray.size()-1; i++){ 
				if (origArray.get(i).intValue() > origArray.get(i+1).intValue()){
					Integer swp = origArray.get(i); 
					origArray.set(i,origArray.get(i+1)); 
					origArray.set(i+1, swp);
					swap = true; 
				}
			}
		}while(swap); 
		
		return origArray; 
		
	}
	
	public static void main (String[] args){
		
		ArrayList<Integer> unsorted = new ArrayList<Integer>(); 
		unsorted.add(new Integer(3)); 
		unsorted.add(new Integer(15));
		unsorted.add(new Integer(18));
		unsorted.add(new Integer(5)); 
		unsorted.add(new Integer(12));
		unsorted.add(new Integer(20));
		unsorted.add(new Integer(7));
		
		BubbleSort bsort = new BubbleSort(); 
		ArrayList<Integer> sorted = bsort.bubbleSort(unsorted);
		
		for (Integer i : sorted){ 
			System.out.println(i.intValue());
		}
		
		
	}

}
