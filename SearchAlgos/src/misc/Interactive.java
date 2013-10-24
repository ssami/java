package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Interactive {
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Type a single digit: "); 
		System.out.println(">> "); 
		String line = br.readLine(); 
		Integer i = Integer.valueOf(line); 
		System.out.println(i.intValue()); 
		
		System.out.println("Type a couple of digits: "); 
		System.out.println(">> "); 
		String stuff = br.readLine(); 
		String arr[] = stuff.split(" ");
		System.out.println(arr[1]); 
		System.out.println(arr[0]); 
		
	}

}
