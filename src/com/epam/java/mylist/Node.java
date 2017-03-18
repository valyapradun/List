package com.epam.java.mylist;

public class Node {
	
	private Node next;       // next element
	private String value;    // value of element
	
	public Node() {
		
	}
	
	public Node(Node next, String value) {
		this.next = next;
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Node: next =" + next + ", value =" + value;
	}
}
