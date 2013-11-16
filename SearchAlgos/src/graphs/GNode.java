package graphs;

import java.util.ArrayList;

public class GNode {
	
	int value; 
	String color;  
	GNode[] edges; 
	
	public GNode(int value){
		this.value = value; 
	}

	
	public static GNode[] init(){
		
		GNode v1 = new GNode(1); 
		GNode v2 = new GNode(2);
		GNode v3 = new GNode(3);
		GNode v4 = new GNode(4);
		GNode v5 = new GNode(5);
		GNode v6 = new GNode(6);
		
		GNode[] v1ed = {v2}; 
		v1.edges = v1ed; 
		
		GNode[] v2ed = {v3, v4}; 
		v2.edges = v2ed; 
		
		GNode[] v3ed = {v5}; 
		v3.edges = v3ed;
		
		GNode[] v4ed = {v5}; 
		//v4.edges = v4ed; 
		
		GNode[] v5ed = {v4}; 
		v5.edges = v5ed; 
		
		GNode[] v6ed = {v2}; 
		v6.edges = v6ed; 
		
		GNode[] graph = {v1, v2, v3, v4, v5, v6};
		
		return graph;
	}
	
	
	public static void dfsPrint(GNode[] graph){
		ArrayList<GNode> discovered = new ArrayList<GNode>(); 
		for (GNode g : graph){
			if (discovered.contains(g)){
				System.out.println("This has been discovered");
			}
			else {
				discovered.add(g);
				dfsPrint(g, discovered);
			}
		}
	}
	
	private static void dfsPrint(GNode g, ArrayList<GNode> disc){
		if (g.edges == null){
			System.out.println(g.value); 
			return; 
		}
		else {
			for (GNode n : g.edges){
				if (!disc.contains(n)){
					disc.add(n);
					dfsPrint(n, disc);
				}
				else {
					
				}
			}
			System.out.println(g.value);
		}
		
	}
	
	public static void main (String args[]){
		GNode[] graph = GNode.init();
		GNode.dfsPrint(graph);
	}
	
}
