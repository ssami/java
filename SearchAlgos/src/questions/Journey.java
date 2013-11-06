package questions;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Journey {
	
	public static void reconstruct(ArrayList<Ticket> places){
		
		CopyOnWriteArrayList<Ticket> wkList = new CopyOnWriteArrayList<Ticket>(); 
		
		//alternate: 
		//make HashMaps of start and ends
		//for each element in working list, find the next or previous element and 
		//add it to the start or end of the list
		
		BitSet b = new BitSet(); 
		
		
		boolean added = false; 
		for (Ticket p : places){
			for (Ticket t : wkList){
				if (t.end.equals(p.start)){
					int curr = wkList.indexOf(t); 
					wkList.add(curr+1, p);
					added = true; 
				}
			}
			if (!added){
				wkList.add(0, p); 
			}
			added = false; 		//reset
		}
		
		for (Ticket w : wkList){
			System.out.println("From " + w.start + " to " + w.end); 
		}
		
		
	}
	
	
	public static void main (String args[]){
		Ticket t1 = new Ticket(); 
		t1.start = "Singapore"; 
		t1.end = "London"; 
		
		Ticket t2 = new Ticket(); 
		t2.start = "Hong Kong"; 
		t2.end = "Australia"; 
		
		Ticket t3 = new Ticket(); 
		t3.start = "Australia"; 
		t3.end = "Singapore";
		
		Ticket t4 = new Ticket(); 
		t4.start = "London";
		t4.end = "Brussels"; 
		
		
		ArrayList<Ticket> places = new ArrayList<Ticket>(); 
		places.add(t1); 
		places.add(t2);
		places.add(t3);
		places.add(t4);
		
		
		Journey.reconstruct(places);
	}
	

}
