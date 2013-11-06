package threadsafe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

//Generates concurrency exceptions when called 

public class ThreadSafeCaller extends Thread {
	
	public static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
	public static CopyOnWriteArrayList<Integer> testlist = new CopyOnWriteArrayList<Integer>(); 
	
	public void run(){
		
		//for (Iterator<Integer> i = testlist.iterator(); i.hasNext();){
		for (Integer i : testlist){
			//Integer dig = (Integer)i.next();
			System.out.println(i);
			Random r = new Random();
			testlist.add(r.nextInt(10)); 
			testlist.remove(testlist.size()/2);
			
		}
		
		System.out.println(Thread.currentThread().getName()); 
		
	}
	
	public static void main (String[] args){ 
		testlist.add(new Integer(10));
		testlist.add(new Integer(20));
		testlist.add(new Integer(30));
		
		for (int i=0; i<1000; i++){
			(new ThreadSafeCaller()).start();
		}
	}

}
