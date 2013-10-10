import java.util.ArrayList;


public class MergeSort {
	
	public ArrayList<Integer> mergeSort(ArrayList<Integer> origArray){
		
		if (origArray.size() < 2){
			return origArray; 
		}
		else{
			int size = origArray.size(); 
			int mid = origArray.size()/2; 
			
			ArrayList<Integer> h1 = new ArrayList<Integer>(); 
			for (int i=0; i<mid; i++){
				h1.add(origArray.get(i)); 
			}
			ArrayList<Integer> h2 = new ArrayList<Integer>(); 
			for (int i=mid+1; i<size; i++){
				h2.add(origArray.get(i)); 
			}
			
			ArrayList<Integer> sortedH1 = mergeSort(h1);
			ArrayList<Integer> sortedH2 = mergeSort(h2);
			
			return (mergeLists(sortedH1, sortedH2)); 
			
		}
	}
	
	public ArrayList<Integer> mergeLists(ArrayList<Integer> aLess, ArrayList<Integer> aMore){
		ArrayList<Integer> mergedList = new ArrayList<Integer>(); 
		int i=0, p=0; 
		while (true){
			if (i<aLess.size() && (aLess.get(i)<aMore.get(p))){
				mergedList.add(aLess.get(i)); 
				i++; 
			}
			else {
				if (p<aMore.size()){
					mergedList.add(aMore.get(p));
					p++;
				}
			}
			if (i==aLess.size() && p==aMore.size()){
				break; 
			}
		}
		
		return mergedList; 
	}
	
	
	public static void main (String args[]){
		ArrayList<Integer> aLess = new ArrayList<Integer>(); 
		aLess.add(new Integer(3)); 
		aLess.add(new Integer(7));
		aLess.add(new Integer(15));
		aLess.add(new Integer(18));
		
		ArrayList<Integer> aMore = new ArrayList<Integer>(); 
		
		
		
		ArrayList<Integer> unsorted = new ArrayList<Integer>(); 
		unsorted.add(new Integer(3)); 
		unsorted.add(new Integer(15));
		unsorted.add(new Integer(18));
		unsorted.add(new Integer(5)); 
		unsorted.add(new Integer(12));
		unsorted.add(new Integer(20));
		unsorted.add(new Integer(7));
		
		MergeSort ms = new MergeSort();
		
		ArrayList<Integer> sorted = ms.mergeSort(unsorted);
		
		for (Integer i : sorted){
			System.out.print(i.intValue() + " "); 
		}
		
		
	}

}
