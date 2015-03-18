package com.linkedlist.ds;

import com.linkedlist.model.Node;

public class LinkedList {
	
	Node headNode;
	
	public void addNode( Node n) {
		Node p = this.getHeadNode();
		if(p == null) {
			this.setHeadNode(n);
			return;
		}
		
		while(p.getNextNode() != null) {
			p = p.getNextNode();
		}
		p.setNextNode(n);
	}
	
	public void createLinkedList(Node ... nodes ) {
		
		
		this.setHeadNode(nodes[0]);
		
		Node p = this.getHeadNode();
		
		for (int i =1 ; i<nodes.length ; i++) {
			p.setNextNode(nodes[i]);
			p = p.getNextNode();
		}
		
		
	}

	public Node getHeadNode() {
		return headNode;
	}

	public void setHeadNode(Node headNode) {
		this.headNode = headNode;
	}
	
	@Override
	public String toString() {
		Node p = this.getHeadNode();
		StringBuffer  sb = new StringBuffer();
		while(p!= null) {
			sb.append(p.getValue());
			p = p.getNextNode();
			if(p!= null) {
				sb.append("->");
			}
			
		}
		
		String ll = sb.toString();
		return ll;
	}
	
	
	
	
}
