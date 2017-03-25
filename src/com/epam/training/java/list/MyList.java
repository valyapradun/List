package com.epam.training.java.list;

public class MyList {
	private Node head; // first element
	private Node tail; // last element

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

		if (head == null) {
			a.setNext(head);
			head = a;
			return;
		}

		Node b = head;
		int count = 1;
		while (b.getNext() != null) {
			count += 1;
			b = b.getNext();
		}

		int position = count / 2;

		if (position == 0) {
			a.setNext(head);
			head = a;
			return;
		}

		if (position > 0) {
			b = head;
			count = 1;
			while (b.getNext() != null) {
				if (count == position) {
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

	public void addByIndex(String value, int index) throws ListException {

		if ((head == null) & (index != 1)) {
			throw new ListException("The wrong index for adding to empty list - " + index + "!");
		}

		Node b = head;
		int count = 1;
		while (b.getNext() != null) {
			count += 1;
			b = b.getNext();
		}

		if ((index <= 0) | (index > count)) {
			throw new ListException("The wrong index for adding to list - " + index + "!");
		}

		Node a = new Node();
		a.setValue(value);

		if (index == 1) {
			a.setNext(head);
			head = a;
		}

		b = head;
		count = 1;
		while (b.getNext() != null) {
			if (count == (index - 1)) {
				a.setNext(b.getNext());
				b.setNext(a);
				return;
			} else {
				count += 1;
			}
			b = b.getNext();
		}
	}

	public String searchByIndex(int index) throws ListException {
		String result = "";
		if (head == null) {
			throw new ListException("The wrong index for searching in the empty list - " + index + "!");
		}

		Node b = head;
		int count = 1;
		while (b.getNext() != null) {
			count += 1;
			b = b.getNext();
		}

		if ((index <= 0) | (index > count)) {
			throw new ListException("The wrong index for searching in the list - " + index + "!");
		}

		if (index == 1) {
			result = head.getValue();
		}

		b = head;
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

	public boolean searchByValue(String value) throws ListException {
		boolean result = false;
		if (head == null) {
			throw new ListException("The wrong value for searching in the empty list - " + value + "!");
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

	public void deleteByValue(String value) throws ListException {
		if (head == null) {
			throw new ListException("The wrong value for deleting in the empty list - " + value + "!");
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

	public void deleteByIndex(int index) throws ListException {
		if ((index <= 0) | (head == null)) {
			throw new ListException("The wrong index for deleting in the list - " + index + "!");
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
			throw new ListException("The wrong index for deleting in the list - " + index + "!");
		} else {
			Node b = head;
			count = 1;
			while (b.getNext() != null) {
				if (count == (index - 1)) {
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
		while (a != null) {
			System.out.print(a.getValue() + " ");
			a = a.getNext();
		}
	}
}
