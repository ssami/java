import java.util.ArrayList;


public class Merge {

	public ArrayList<Integer> mergeLists(ArrayList<Integer> aLess, ArrayList<Integer> aMore){
		ArrayList<Integer> mergedList = new ArrayList<Integer>(); 
		int i=0, p=0; 
//		while (true){
//			
//		}
		
		return mergedList; 
	}
	
	
	public static void main (String args[]){
		ArrayList<Integer> aLess = new ArrayList<Integer>(); 
		aLess.add(new Integer(3)); 
		aLess.add(new Integer(7));
		aLess.add(new Integer(15));
		aLess.add(new Integer(18));
		
		ArrayList<Integer> aMore = new ArrayList<Integer>(); 
		aMore.add(new Integer(5)); 
		aMore.add(new Integer(7));
		aMore.add(new Integer(20));
		
		
		Merge ms = new Merge();
		
		ArrayList<Integer> sorted = ms.mergeLists(aLess, aMore);
		
		for (Integer i : sorted){
			System.out.print(i.intValue() + " "); 
		}
		
		
	}

}
