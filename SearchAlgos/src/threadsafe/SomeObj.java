package threadsafe;

public class SomeObj {
	
	private int value = 0; 
	
	public SomeObj(int val){
		this.value = val; 
	}
	
	synchronized public int getValue(){
		System.out.println("Lock on getValue");
		return value; 
	}
	
	public synchronized void diff(SomeObj other){
		System.out.println("Lock on diff");
		System.out.println(value - other.getValue());
	}

}
