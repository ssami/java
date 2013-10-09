
public class BinNode {

	private int data = 0; 
	private BinNode left = new BinNode(); 
	private BinNode right = new BinNode(); 
	
	public void setData(int data){
		this.data = data; 
	}
	
	public int getData(){
		return this.data; 
	}
	
	public void setLeftChild(BinNode n){
		this.left = n; 
	}
	
	public BinNode getLeftChild(){
		return this.left; 
	}
	
	public void setRightChild(BinNode n){
		this.right = n; 
	}
	
	public BinNode getRightChild(){
		return this.right; 
	}
}
