import java.util.ArrayList;


public class BreadthFirstSearch {

	ArrayList<Node> queue = new ArrayList<Node>(); 
	
	public Node initNodes(){

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
		
		Node fourth = new Node(); 
		fourth.setName("fourth"); 
		fourth.setWeight(10);
		
		Node fifth = new Node(); 
		fifth.setName("fifth"); 
		fifth.setWeight(2);
		
		ArrayList<Node> startNodes = new ArrayList<Node>(); 
		startNodes.add(second);
		startNodes.add(first); 
		start.addEdges(startNodes);
		
		ArrayList<Node> firstNodes = new ArrayList<Node>();
		firstNodes.add(third);
		firstNodes.add(second);
		first.addEdges(firstNodes);
		
		ArrayList<Node> thirdNodes = new ArrayList<Node>(); 
		thirdNodes.add(fourth); 
		thirdNodes.add(fifth);
		third.addEdges(thirdNodes); 
		
		ArrayList<Node> fifthNodes = new ArrayList<Node>(); 
		fifthNodes.add(second); 
		fifth.addEdges(fifthNodes);
		
		return start; 
	}
	
	public void breadthSearch(Node begin){
		
		queue.add(begin); 
		while (!queue.isEmpty()){
			// DEBUG
			System.out.print("Queue: ");
			for (Node n : queue){
				System.out.print(n.getName() + ",");
			}
			//DEBUG
			
			System.out.println("");
			
			Node curr = queue.remove(0); 
			if (curr.getEdges().isEmpty()){
				System.out.println("Node: " + curr.getName()); 
			}
			else {
				System.out.println("Node: " + curr.getName());
				for (Node n : curr.getEdges()){
					if (!queue.contains(n)){
						System.out.println("Node: " + n.getName());
						queue.add(n);
					}
				} 
			}
			
		}

	}
	
	public static void main(String args[]){
		BreadthFirstSearch bfs = new BreadthFirstSearch(); 
		bfs.breadthSearch(bfs.initNodes());
	}
	
	
}
