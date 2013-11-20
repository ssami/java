import java.util.ArrayList;


public class LeastCommonAncestor {
	
	public static Node init(){
		
		Node root = new Node(); 
		root.setWeight(0);
		
		Node one = new Node(); 
		one.setWeight(1); 
		
		Node two = new Node(); 
		two.setWeight(2); 
		
		Node three = new Node(); 
		three.setWeight(3); 
		
		Node four = new Node(); 
		four.setWeight(4);
		
		Node five = new Node(); 
		five.setWeight(5);
		
		Node six = new Node(); 
		six.setWeight(6);
		
		Node seven = new Node(); 
		seven.setWeight(7);
		
		Node eight = new Node(); 
		eight.setWeight(8);
		
		ArrayList<Node> redges = new ArrayList<Node>(); 
		redges.add(one); 
		redges.add(two);
		redges.add(three); 
		root.addEdges(redges);
		
		ArrayList<Node> thedges = new ArrayList<Node>(); 
		thedges.add(four); 
		three.addEdges(thedges);
		
		ArrayList<Node> tedges = new ArrayList<Node>(); 
		tedges.add(five);
		tedges.add(six);
		two.addEdges(tedges);
		
		ArrayList<Node> fedges = new ArrayList<Node>(); 
		fedges.add(eight);
		
		ArrayList<Node> sedges = new ArrayList<Node>(); 
		sedges.add(seven);
		six.addEdges(sedges);
		
		return root; 
	}
	
	
	
	

}
