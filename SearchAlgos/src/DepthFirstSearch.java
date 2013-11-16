import java.util.ArrayList;


public class DepthFirstSearch {
	
	public void initNodes(){
		
		
		Node start = new Node(); 
		start.setName("start");
		start.setWeight(5); 
		
		Node first = new Node(); 
		first.setName("first"); 
		first.setWeight(3);
		
		Node second = new Node(); 
		second.setName("second"); 
		second.setWeight(9);
		
		Node third = new Node(); 
		third.setName("third"); 
		third.setWeight(4);
		
		ArrayList<Node> startNodes = new ArrayList<Node>(); 
		startNodes.add(first); 
		startNodes.add(second);
		start.addEdges(startNodes);
		
		ArrayList<Node> firstNodes = new ArrayList<Node>();
		firstNodes.add(third);
		firstNodes.add(second);
		first.addEdges(firstNodes);
		
	}
	
	public void depthFirstSearch(Node n, ArrayList<Node> stack){

		
	}
	
	public static void main (String[] args){
		
	}

}
