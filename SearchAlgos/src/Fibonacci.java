
public class Fibonacci {

	// 0 1 1 2 3 5 8 13 21 34 55 
	
	public void printStraightFibonacci(int nth){
		 
		int prev1 = 0; 
		int prev2 = 1;
		System.out.println(prev1);
		System.out.println(prev2);
		for (int i=nth-2; i>0; i--){
			int curr = prev1 + prev2;
			prev1 = prev2; 
			prev2 = curr; 
			System.out.println(curr); 
		}
	}
	
	public void printRecursiveFibonacci(int nth){
		
	}
	
	public static void main(String args[]){
		Fibonacci f = new Fibonacci(); 
		f.printStraightFibonacci(8);
	}
}
