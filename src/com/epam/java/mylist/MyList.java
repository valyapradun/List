package com.epam.java.mylist;

public class MyList {
	private Node head;       // first element
	private Node tail;       // last element
	
	public MyList() {
	
	}
	
	public MyList(Node head, Node tail) {
		this.head = head;
		this.tail = tail;
	}

	public void addFront(String value) {
		Node a = new Node();  
		a.setValue(value);
	                              
		if (head == null) {                           
			head = a;              
			tail = a;
		} else {
			a.setNext(head);
			head = a;               
		}
	}
	
	public void addBack(String value) {          
		Node a = new Node();  
		a.setValue(value);
		
		if (tail == null) {                           
			head = a;               
			tail = a;
		} else {
			tail.setNext(a);
			tail = a;               
		}
	}
	
	public void addMiddle(String value) {          
		Node a = new Node();  
		a.setValue(value);
		
		Node b = head;  
		int count = 1;
		while (b.getNext() != null) {
			count += 1; 
			b = b.getNext();
		}
		
		int position = count / 2;
		
		if (position == 0) { 
			tail.setNext(a);
			tail = a;
			return;   
		}
		
		if (position > 0) {
			b = head;  
			count = 1;
			while (b.getNext() != null) {
				if (count == position){
					a.setNext(b.getNext());
					b.setNext(a);
					return;   
				} else {
					count += 1; 
				}
				b = b.getNext();
			}	
		}	
	}
		
	
	public void deleteByValue(String value)          
	{
		if (head == null) {
			return;  
		}

		if (head == tail) { 
			head = null;        
			tail = null;
			return;             
		}
	 
		if (head.getValue() == value) {
			head = head.getNext();
			return;
		}
		
		Node a = head;       
		while (a.getNext() != null) {    
			if (a.getNext().getValue() == value) {
				if (tail == a.getNext()) {
					tail = a;          
				}
				a.setNext(a.getNext().getNext());
				return;                
			}
			a = a.getNext();
		}
	}
	
	
	public void deleteByIndex(int index)          
	{
		if (index <= 0) {
			System.out.println("Wrong index!");
			return;  
		}
		
		if (head == null) {
			return;  
		}

		if ((head == tail) & (index == 1)) { 
			head = null;        
			tail = null;
			return;             
		}
	 
		if ((head != tail) & (index == 1)) { 
			head = head.getNext();      
			return;             
		}

		Node a = head;  
		int count = 1;
		while (a.getNext() != null) {
			count += 1; 
			a = a.getNext();
		}
		
		if (index > count) {
			System.out.println("Wrong index!");
			return; 
		} else {
			Node b = head;  
			count = 1;
			while (b.getNext() != null) {
				if (count == (index-1)){
					b.setNext(b.getNext().getNext());
					return;   
				} else {
					count += 1; 
				}
				b = b.getNext();
			}	
		}
	}
	
	public void printList() {
		Node a = head;          
		while (a != null)           
		{
			System.out.print(a.getValue() + " ");
			a = a.getNext();
		}
	}
}
