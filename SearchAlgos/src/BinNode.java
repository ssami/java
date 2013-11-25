
public class BinNode {

	public int data = 0; 
	public BinNode left;  
	public BinNode right; 
	
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
