package com.linkedlist.manipulations;

import com.linkedlist.ds.LinkedList;
import com.linkedlist.model.Node;

public class Problem {

	public static LinkedList reverseLinkedList(LinkedList ll) {
		
		Node p = ll.getHeadNode();
		
		if(p.getNextNode() == null) {
			return ll;
		}
		
		Node r;
		Node q = p.getNextNode();
		p.setNextNode(null);
		while(q != null) {
			r = q.getNextNode();
			q.setNextNode(p);
			p = q;
		    q = r; 
			
		}
		//LinkedList rll = new LinkedList();
		ll.setHeadNode(p);
		
		return ll;
		
	}
	
	
}
