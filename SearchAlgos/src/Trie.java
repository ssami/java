import java.util.ArrayList;


public class Trie {

	//built out of Node nodes
	
	Node root; 
	
	public Trie (){
		root = new Node(); 
		root.setName("");
		ArrayList<Node> suffix = new ArrayList<Node>(); 
		root.addEdges(suffix);	
	}
	
	public void addString(String s, int c, Node curr){
		if (c == s.length()){
			return; 
		} 
		
		if (curr.getEdges() == null){
			ArrayList<Node> ed = new ArrayList<Node>(); 
			curr.addEdges(ed); 
		}
		
		boolean dealt = false; 
		for (Node p : curr.getEdges()){
			if (p.getName().equals(s.substring(c, c+1))){
				addString(s, c+1, p);
				dealt = true; 
			}
		}
		if (!dealt){
			Node n = new Node();
			n.setName(s.substring(c, c+1));
			curr.getEdges().add(n);
			addString(s, c+1, n);
		}
		
	}
	
	public void printTree(){
		print(root, "");
	}
	
	private void print(Node n, String s){
		if (n.getEdges() == null || n.getEdges().isEmpty()){
			System.out.println(s); 
			return; 
		}
		else {
			for (Node c : n.getEdges()){
				//System.out.print(s + c.getName());
				print(c, s+c.getName());
			}
		}
	}
	
	public static void main (String args[]){
		
		Trie t = new Trie(); 
		t.addString("there", 0, t.root);
		//t.printTree();
		t.addString("where", 0, t.root);
		t.addString("their", 0, t.root);
		t.printTree();
	}
	
}
