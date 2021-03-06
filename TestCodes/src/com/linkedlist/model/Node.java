package com.linkedlist.model;

public class Node {
	private Node nextNode = null;
	private int value;
	
	public Node(Node nextNode, int value) {
		this.nextNode = nextNode;
		this.value = value;
	}
	
	public Node(int value) {
		this.value = value;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node node) {
		this.nextNode = node;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
