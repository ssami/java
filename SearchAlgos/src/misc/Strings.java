package misc;

public class Strings {
	
	private static void print(Object o){
		System.out.println(o.toString());
	}
	
	
	public static void main (String args[]){
		String example = "today is the day everything is great!"; 
		
		for (String c : example.split("")){
			print(c);
		}
		
		
		
	}
	
	

}
