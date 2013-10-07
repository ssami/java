import java.util.ArrayList;


public class Node {

	private String name = ""; 
	private int weight = 0; 
	private ArrayList<Node> edges = new ArrayList<Node>(); 
	
	public String getName(){
		return name; 
	}
	
	public int getWeight(){
		return weight; 
	}
	
	public ArrayList<Node> getEdges(){
		return edges;
	}
	
	public void setName(String name){
		this.name = name; 
	}
	
	public void setWeight(int wt){
		this.weight = wt; 
	}
	
	public void addEdges(ArrayList<Node> nodes){
		for (Node n : nodes){
			this.edges.add(n);
		}
	}
	
}
