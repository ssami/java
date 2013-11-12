package misc;

import java.util.ArrayList;

public class MaxHeap {

	public static ArrayList<Integer> init(){
		ArrayList<Integer> heap = new ArrayList<Integer>(); 
		heap.add(20);
		heap.add(15);
		heap.add(18);
		heap.add(12);
		heap.add(10);
		heap.add(13);
		heap.add(17);
		heap.add(9);
		
		return heap; 
	}
	
	public static ArrayList<Integer> init(BinNode heapTree){
		ArrayList<BinNode> queue = new ArrayList<BinNode>();
		ArrayList<Integer> heapList = new ArrayList<Integer>(); 
		queue.add(heapTree); 
		while (!queue.isEmpty()){
			BinNode curr = queue.remove(0); 
			if (curr.getLeftChild() != null){
				queue.add(curr.getLeftChild()); 
			}
			if (curr.getRightChild() != null){
				queue.add(curr.getRightChild()); 
			}
			heapList.add(curr.getData()); 
		}
		
		return heapList; 
		
	}
	
	public static ArrayList<Integer> insertNode(ArrayList<Integer> heap, Integer ins){
		
		heap.add(ins); //adds to end of the list 
		bubbleUp(heap, heap.size()-1);
		
		return heap; 
		
	}
	
	private static void bubbleUp(ArrayList<Integer> heap, Integer currInd){
		
		int parInd = (int)Math.ceil((double)currInd/2) - 1;
		System.out.println(parInd);
		if (heap.get(parInd) < heap.get(currInd)){
			int tmp = heap.get(parInd); 
			heap.set(parInd, heap.get(currInd));
			heap.set(currInd, tmp);
			bubbleUp(heap, parInd); 
		}
		else {
			return; 
		}
	}
	
	public static void main (String args[]){
		ArrayList<Integer> heap = MaxHeap.init();
		MaxHeap.insertNode(heap, new Integer(19));
		
	}
	
}
