
public class BinarySearchTree {

	public BinNode init(){
		BinNode root = new BinNode(); 
		root.setData(10); 
		
		BinNode n1 = new BinNode(); 
		n1.setData(8);
		
		BinNode n2 = new BinNode(); 
		n2.setData(15);
		
		BinNode n3 = new BinNode(); 
		n3.setData(6);

		BinNode n4 = new BinNode(); 
		n4.setData(9);
		
		BinNode n5 = new BinNode(); 
		n5.setData(13);
		
		BinNode n6 = new BinNode(); 
		n6.setData(17);
		
		BinNode n7 = new BinNode(); 
		n7.setData(5);
		
		root.setLeftChild(n1);
		root.setRightChild(n2); 
		
		n1.setLeftChild(n3);
		n1.setRightChild(n4);
		
		n2.setLeftChild(n5);
		n2.setRightChild(n6);
		
		n3.setLeftChild(n7);
		
		return root; 
	}
	
	public void traverseInOrderBST(BinNode node){
		if (node.getLeftChild() == null && node.getRightChild() == null){
			System.out.println(node.getData()); 
			return; 
		}
		else {
			if (node.getLeftChild() != null){
				traverseInOrderBST(node.getLeftChild());
			}
			System.out.println(node.getData());
			if (node.getRightChild() != null){
				traverseInOrderBST(node.getRightChild());
			}
		}
	}
	
	
	public static void main (String args[]){
		BinarySearchTree bst = new BinarySearchTree(); 
		BinNode root = bst.init();
		bst.traverseInOrderBST(root);
	}
}
