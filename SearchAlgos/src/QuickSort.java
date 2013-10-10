import java.util.ArrayList;
import java.util.Random;


public class QuickSort {
	
	public ArrayList<Integer> quickSort(ArrayList<Integer> origArray){
		
		
		if (origArray.size() < 1 || origArray.size() == 1){
			return origArray; 
		}
		else {
			Integer pivot = pickPivot(origArray, 1); 
			ArrayList<Integer> lessThan = new ArrayList<Integer>(); 
			ArrayList<Integer> moreThan = new ArrayList<Integer>(); 
			
			for (Integer n : origArray){
				if (n.intValue() < pivot.intValue()){
					lessThan.add(n); 
				}
				else {
					moreThan.add(n); 
				}
			}
			
			ArrayList<Integer> sortedLess = quickSort(lessThan); 
			ArrayList<Integer> sortedMore = quickSort(moreThan); 
			
			ArrayList<Integer> concatSorted = new ArrayList<Integer>(); 
			concatSorted.addAll(sortedLess); 
			concatSorted.addAll(sortedMore); 
			
			return concatSorted; 
		
		}
		
		
	}
	
	private Integer pickPivot(ArrayList<Integer> array, int method){
		
		if (method == 0){
			int index = array.size()/2; 
			return array.get(index); 
		}
		else {
			Random r = new Random();
			int index = r.nextInt(array.size()); 
			return array.get(index); 
		}
		
	}
	
	
	public static void main (String args[]){
		
		ArrayList<Integer> startArray = new ArrayList<Integer>(); 
		startArray.add(new Integer(2));
		startArray.add(new Integer(1));
		startArray.add(new Integer(8));
		startArray.add(new Integer(7));
		startArray.add(new Integer(4));
		startArray.add(new Integer(-6));
		startArray.add(new Integer(0));
		startArray.add(new Integer(3));
		startArray.add(new Integer(5));
		startArray.add(new Integer(10));
		
		
		QuickSort qs = new QuickSort(); 
		ArrayList<Integer> sorted = qs.quickSort(startArray);
		
		for (Integer i : sorted){
			System.out.println(i.intValue()); 
		}
		
		
	}

}
