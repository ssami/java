package misc;

import java.util.HashMap;

public class LinkedList {

	
	public LNode insertNode(LNode head, LNode toIns){
		//returns pointer to head of node
		
		LNode tmp = new LNode(); 
		tmp = head; 
		while (tmp.next != null){
			tmp = tmp.next; 
		}
		tmp.next = toIns; 
		return head; 
	}
	
	
	public void printList(LNode head){
		while (head != null){
			System.out.println(head.value); 
			head = head.next; 
		}
	}
	
	public LNode isLoop(LNode head){
		HashMap<Integer, Integer> listNodes = new HashMap<Integer, Integer>(); 
		LNode tmp = new LNode(); 
		tmp = head; 
		while (tmp != null){
			if (listNodes.containsKey(tmp.hashCode())){
				System.out.println(tmp.value);
				return tmp;
			}
			else {
				listNodes.put(new Integer(tmp.hashCode()), new Integer(1));
			}
			tmp = tmp.next; 
		}
		return null; 
	}
	
	public static void main(String args[]){
		
		LNode one = new LNode(); 
		one.value = 1; 
		
		LNode two = new LNode(); 
		two.value = 2; 
		one.next = two; 
		
		LNode three = new LNode(); 
		three.value = 3; 
		two.next = three; 
		
		LNode four = new LNode(); 
		four.value = 4; 
		three.next = four; 
		
		LNode five = new LNode(); 
		five.value = 5; 
		
		LinkedList ll = new LinkedList(); 
		LNode head = ll.insertNode(one, five);
		ll.printList(head); 
		
		five.next = three; 
		ll.isLoop(head);
		
	}
}
