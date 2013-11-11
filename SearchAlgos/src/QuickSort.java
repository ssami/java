import java.util.ArrayList;
import java.util.Arrays;
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
	
	public int[] quickSort(int[] origArray){
		if (origArray.length < 2){
			return origArray; 
		}
		else {
			int pivot = pickPivot(origArray, 1);
			int[] lessThan = Arrays.copyOfRange(origArray, 0, pivot);
			int[] moreThan = Arrays.copyOfRange(origArray, pivot+1, origArray.length); 
			
			int[] sortedLess = quickSort(lessThan);
			int[] sortedMore = quickSort(moreThan);

			int[] concatSorted = new int[sortedLess.length + sortedMore.length];
			System.arraycopy(sortedLess, 0, concatSorted, 0, sortedLess.length);
			System.arraycopy(sortedMore, 0, concatSorted, sortedLess.length, sortedMore.length);
			
			return concatSorted; 
			
		}
	}
	
	private int pickPivot(int[] array, int method){
		if (method == 0){
			int index = array.length/2; 
			return array[index]; 
		}
		else {
			Random r = new Random(); 
			int index = r.nextInt(array.length); 
			return array[index]; 
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
		startArray.add(new Integer(5));
		startArray.add(new Integer(7));
		startArray.add(new Integer(4));
		startArray.add(new Integer(-6));
		startArray.add(new Integer(0));
		startArray.add(new Integer(3));
		startArray.add(new Integer(5));
		startArray.add(new Integer(10));
		
		Integer some = new Integer(5);
		Integer target = new Integer(10);
		for (Integer i : startArray){
			if (i + some == target || i + some > target){
				System.out.println(i.intValue()); 
			}
		}
		
		QuickSort qs = new QuickSort(); 
		ArrayList<Integer> sorted = qs.quickSort(startArray);
		
		for (Integer i : sorted){
			System.out.println(i.intValue()); 
		}
		
		
	}

}
