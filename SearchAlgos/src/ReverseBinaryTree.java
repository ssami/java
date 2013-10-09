
public class ReverseBinaryTree {

	public BinNode initTree(){
		BinNode root = new BinNode(); 
		
		BinNode two = new BinNode(); 
		two.setData(2);
		
		BinNode three = new BinNode(); 
		three.setData(3);
		
		BinNode four = new BinNode(); 
		four.setData(4);
		
		BinNode five = new BinNode(); 
		five.setData(5);
		
		BinNode six = new BinNode(); 
		six.setData(6);
		
		BinNode seven = new BinNode(); 
		seven.setData(7);
		
		BinNode eight = new BinNode(); 
		eight.setData(8);
		
		BinNode nine = new BinNode(); 
		nine.setData(9);
		
		root.setLeftChild(two);
		root.setRightChild(three); 
		
		two.setLeftChild(six); 
		two.setRightChild(five); 
		
		three.setLeftChild(four); 
		
		five.setRightChild(nine);
		
		six.setLeftChild(seven);
		six.setRightChild(eight); 
		
		return root; 
	}
	
	
	public void printTree(BinNode entry){
		if (entry == null){
			return; 
		}
		else { 
			System.out.println("Current node: " + entry.getData());
			if (entry.getLeftChild() != null){
				System.out.println("Left child: " + entry.getLeftChild().getData()); 
			}
			if (entry.getRightChild() != null){
				System.out.println("Right child: " + entry.getRightChild().getData());
			}
			printTree(entry.getLeftChild());
			printTree(entry.getRightChild()); 
			
		}
	}
	
	
	public static void main (String args[]){
		ReverseBinaryTree rbt = new ReverseBinaryTree(); 
		rbt.printTree(rbt.initTree()); 
		
	}
}
