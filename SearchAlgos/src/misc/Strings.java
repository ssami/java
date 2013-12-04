package misc;

import java.util.Set;

public class Strings {
	
	private static void print(Object o){
		System.out.println(o.toString());
		 
	}
	
	
	
	//http://www.careercup.com/question?id=5965096199127040
	// Things learned: 
	// split() returns String[] not an ArrayList
	//Arrays.asList returns a List<String> but that list is fixed size - cannot remove elements
	//char can be modified to CharSequence if you do String.valueOf(c)
	public static boolean isAnagram(String s1, String s2){
		if (s1.length() != s2.length()){
			return false; 
		}
		
		for (char c : s1.toCharArray()){
			if (s1.contains(String.valueOf(c))){
				s1 = s1.substring(0, s1.indexOf(c)) + s1.substring(s1.indexOf(c)+1, s1.length());
			}
			else {
				return false; 
			}
		}
		if (s1.length() == 0){
			return true; 
		}
		else {
			return false;
		}
		
	}
	
	public static void main (String args[]){
//		String example = "today is the day everything is great!"; 
//		
//		for (String c : example.split("")){
//			print(c);
//		}
		
		print(Strings.isAnagram("cineme", "iceman"));
		
	}
	
	

}
