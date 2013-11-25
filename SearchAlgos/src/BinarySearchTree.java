import java.util.ArrayList;


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
		n7.setData(3);
		
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
	
	public void printPath(BinNode root, int val) {
		ArrayList<ArrayList<BinNode>> paths = new ArrayList<ArrayList<BinNode>>(); 
		printPath(root, val, 0, paths); 
		
		for (ArrayList<BinNode> p : paths){
			for (BinNode b : p){
				System.out.print(b.data + ",");
			}
			System.out.println(); 
		}
		
	}

	
	private boolean printPath(BinNode curr, int val, int currVal, ArrayList<ArrayList<BinNode>> paths){
		if (curr.left == null && curr.right == null) {
			if (curr.data + currVal == val) {
				ArrayList<BinNode> path = new ArrayList<BinNode>();
				path.add(curr); 
				paths.add(path);
				return true;
			}
			else {
				return false; 
			}
		}

		boolean leftVal = true; 
		boolean rightVal = false; 
		if (currVal < val) {
			if (curr.left != null){
				leftVal = printPath(curr.left, val, currVal + curr.data, paths);
			}
			if (curr.right != null){
				rightVal = printPath(curr.right, val, currVal + curr.data, paths);
			}
			// returning from recursion
			if (leftVal || rightVal) {
				for (ArrayList<BinNode> p : paths){
					p.add(curr);
					// all paths to the left of the node must be part of the paths 
				}
				return true; 
			} 
			else {
				return false; 
			}
			
//			if (leftVal || rightVal){
//				if (leftVal){
//					for (ArrayList<BinNode> p : paths){
//						if (p.contains(curr.left)){
//							p.add(curr);
//						}
//					}
//				}
//				if (rightVal){
//					for (ArrayList<BinNode> p : paths){
//						if (p.contains(curr.right)){
//							p.add(curr);
//						}
//					}
//				}
//				return true;
//			}
//			
//			else {
//				return false; 
//			}
		}
		else {
			return false; 
		}
		
	}
	
	
	public static void main (String args[]){
		BinarySearchTree bst = new BinarySearchTree(); 
		BinNode root = bst.init();
		//bst.traverseInOrderBST(root);
		bst.printPath(root, 27);
	}
}
