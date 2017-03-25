package com.epam.training.java.list;

public class Service {

	private MyList ml = new MyList();

	public Service() {

	}

	public void addBackToList() {
		ml.addBack("One");
		ml.addBack("Two");
		ml.addBack("Three");
		System.out.print("The list with the added elements by in the end: ");
		ml.printList();
		System.out.println();
	}

	public void addFrontToList() {
		ml.addFront("Four");
		ml.addFront("Five");
		System.out.print("The list with the added elements by in the begining: ");
		ml.printList();
		System.out.println();
	}

	public void addMiddleToList() {
		ml.addMiddle("Six");
		ml.addMiddle("Seven");
		System.out.print("The list with the added elements by in the middle: ");
		ml.printList();
		System.out.println();
	}

	public void addByIndexToList() {
		try {
			ml.addByIndex("Eight", 3);
			ml.addByIndex("Nine", 1);
		} catch (ListException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.print("The list with the added elements by the index (3, 1): ");
		ml.printList();
		System.out.println();
	}

	public void searchByIndexInList() {
		String result = "";
		try {
			result = ml.searchByIndex(3);
		} catch (ListException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.print("The element of the index 2 is: " + result);
		System.out.println();
	}

	public void searchByValueInList() {
		boolean result = false;
		try {
			result = ml.searchByValue("One");
		} catch (ListException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.print("The element 'One' contains in the list: " + result);
		System.out.println();
	}

	public void deleteByValueFromList() {
		try {
			ml.deleteByValue("Ten");
			ml.deleteByValue("Four");
			ml.deleteByValue("Seven");
		} catch (ListException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.print("The list with the deleted elements by the value (Ten, Four, Seven): ");
		ml.printList();
		System.out.println();
	}

	public void deleteByIndexFromList() {
		try {
			ml.deleteByIndex(1);
			ml.deleteByIndex(4);
		} catch (ListException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.print("The list with the deleted elements by the index (1, 4): ");
		ml.printList();
		System.out.println();
	}

}
