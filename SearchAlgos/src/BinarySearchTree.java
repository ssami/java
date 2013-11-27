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
	

	//http://thereq.com/q/203/java-software-interview-question/longest-path-in-a-binary-tree
	public int measurePath(BinNode node){
		if (node.getLeftChild() == null && node.getRightChild() == null){
			return 0; 
		}
		else {
			int leftCt = 0, rightCt = 0; 
			if (node.getLeftChild() != null){
				leftCt = measurePath(node.getLeftChild());
			}
			if (node.getRightChild() != null){
				rightCt = measurePath(node.getRightChild()); 
			}
			
			return leftCt > rightCt? leftCt + 1 : rightCt + 1; 
		}
	}
	
	
	public void dfsStack(BinNode root){
		ArrayList<BinNode> stack = new ArrayList<BinNode>();
		stack.add(root);
		dfs(root, stack); 
		
	}
	
	private void dfs(BinNode n, ArrayList<BinNode> stack){
		while (!stack.isEmpty()){
			BinNode curr = stack.remove(0);
			
			if (curr.getRightChild() != null){
				stack.add(0, curr.getRightChild());
			}
			System.out.println(curr.getData());
			if (curr.getLeftChild() != null){
				stack.add(0, curr.getLeftChild());
			}
			
		}
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
	
	
	//http://thereq.com/q/204/java-software-interview-question/the-nth-smallest-element-in-a-binary-tree
//	public int nthSmallest(BinNode node, int n){
//		
//		if (node.getLeftChild() == null && node.getRightChild() == null){
//			// this is a leaf, start counting down from n
//			n--; 
//			if (n > 0){
//				return n; 
//			}
//			else {
//				System.out.println(node.getData());
//				return n; 
//			}
//		}		
//		if (n > 0 && node.getLeftChild() != null){
//			n = nthSmallest(node.getLeftChild(), n);
//		}
//		n--; 
//		if (n == 0){
//			System.out.println(node.getData());
//			return n; 
//		}
//		else {
//			if (n > 0 && node.getRightChild() != null){
//				n = nthSmallest(node.getRightChild(), n);
//			}
//			if (n > 0){
//				System.out.println(node.getData());
//			}
//			return n; 
//		}		
//	}

	
	//http://codercareer.blogspot.com/2011/09/no-04-paths-with-specified-sum-in.html
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
		//bst.printPath(root, 27);
		//bst.nthSmallest(root, 4);
		//bst.dfsStack(root);
		
		System.out.println(bst.measurePath(root));
		
		
	}
}
