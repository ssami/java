import java.util.ArrayList;


public class Merge {

	public ArrayList<Integer> mergeLists(ArrayList<Integer> aLess, ArrayList<Integer> aMore){
		ArrayList<Integer> mergedList = new ArrayList<Integer>(); 
		int i=0, p=0; 
		while (true){
			System.out.println("Left: " + aLess.get(i) + " Right: " + aMore.get(p)); 
			if (aLess.get(i).intValue() < aMore.get(p).intValue()){
				mergedList.add(aLess.get(i)); 
				if (i< aLess.size()-1){
					i++; 
				}
			}
			else if (aLess.get(i).intValue() > aMore.get(p).intValue()){
				mergedList.add(aMore.get(p)); 
				if (p<aMore.size()-1){
					p++;
				}
			}
			else {
				mergedList.add(aLess.get(i)); 
				mergedList.add(aMore.get(p));
				if (i< aLess.size()-1){
					i++; 
				}
				if (p<aMore.size()-1){
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
