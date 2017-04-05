package com.epam.training.java.list;

public class List {
	private Node head; // first element
	private Node tail; // last element

	public List() {

	}

	public List(Node head, Node tail) {
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

	public boolean addByIndex(String value, int index) {
		if ((head == null) & (index != 1)) {
			return false;
		}
		
		int count = sizeList();
		if ((index <= 0) | (index > count)) {
			return false;
		}

		Node a = new Node();
		a.setValue(value);

		if (index == 1) {
			a.setNext(head);
			head = a;
		}

		Node b = head;
		count = 1;
		while (b.getNext() != null) {
			if (count == (index - 1)) {
				a.setNext(b.getNext());
				b.setNext(a);
				return true;
			} else {
				count += 1;
			}
			b = b.getNext();
		}
		return true;
	}

	public String searchByIndex(int index) throws ListException {
		String result = "";
		if (head == null) {
			throw new ListException("The wrong index for searching in the empty list - " + index + "!");
		}

		int count = sizeList();
		if ((index <= 0) | (index > count)) {
			throw new ListException("The wrong index for searching in the list - " + index + "!");
		}

		if (index == 1) {
			result = head.getValue();
		}

		Node b = head;
		count = 1;
		while (b.getNext() != null) {
			if (count == (index - 1)) {
				result = b.getValue();
				break;
			} else {
				count += 1;
			}
			b = b.getNext();
		}
		return result;
	}

	public boolean searchByValue(String value) {
		boolean result = false;
		if (head == null) {
			result = false;
		}
		Node a = head;
		while (a.getNext() != null) {
			if (a.getValue().equals(value)) {
				result = true;
			}
			a = a.getNext();
		}
		return result;
	}
	
	public boolean deleteByValue(String value) {
		boolean result = false;
		
		if (head == null) {
			result = false;
		}

		if (head == tail) {
			head = null;
			tail = null;
			result = false;
		}

		if (head.getValue() == value) {
			head = head.getNext();
			result = true;
		}

		Node a = head;
		while (a.getNext() != null) {
			if (a.getNext().getValue() == value) {
				if (tail == a.getNext()) {
					tail = a;
				}
				a.setNext(a.getNext().getNext());
				result = true;
			}
			a = a.getNext();
		}
		
		return result;
	}
	
	public boolean deleteByIndex(int index) {
		boolean result = false;
		if ((index <= 0) | (head == null)) {
			result = false;
		}

		if ((head == tail) & (index == 1)) {
			head = null;
			tail = null;
			result = true;
		}

		if ((head != tail) & (index == 1)) {
			head = head.getNext();
			result = true;
		}

		int count = sizeList();

		if (index > count) {
			result = false;
		} else {
			Node b = head;
			count = 1;
			while (b.getNext() != null) {
				if (count == (index - 1)) {
					b.setNext(b.getNext().getNext());
					result = true;
				} else {
					count += 1;
				}
				b = b.getNext();
			}
		}
		
		return result;
	}
	
	public void printList() {
		Node a = head;
		while (a != null) {
			System.out.print(a.getValue() + " ");
			a = a.getNext();
		}
	}
	
	public int sizeList(){
		Node b = head;
		int count = 1;
		while (b.getNext() != null) {
			count += 1;
			b = b.getNext();
		}
		return count;
	}
}
