package misc;

public class Combinations {

	public static void findPerms(String str, String bag){
		
		if (bag.length() == 0){
			System.out.println(str);
		}
		else {
			for (int i=0; i<bag.length(); i++){
				String newbag = bag.substring(0, i) + bag.substring(i+1);
				findPerms(str + bag.charAt(i), newbag);
			}
			
		}
		
	}
	
	public static void main (String args[]){
		Combinations.findPerms("", "abc");
	}
	
}
