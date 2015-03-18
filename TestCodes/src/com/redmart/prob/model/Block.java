package com.redmart.prob.model;

public class Block {
	private int value;
	private int longestPathVal = 1;
	private int deepestPathVal = 0;
	private  Position position;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getLongestPathVal() {
		return longestPathVal;
	}
	public void setLongestPathVal(int longestPathVal) {
		this.longestPathVal = longestPathVal;
	}
	public int getDeepestPathVal() {
		return deepestPathVal;
	}
	public void setDeepestPathVal(int deepestPathVal) {
		this.deepestPathVal = deepestPathVal;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	
	
}
