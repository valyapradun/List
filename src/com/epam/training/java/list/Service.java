package com.epam.training.java.list;

public class Service {

	private List list = new List();

	public Service() {

	}

	public void addBackToList() {
		list.addBack("One");
		list.addBack("Two");
		list.addBack("Three");
		System.out.print("The list with the added elements by in the end: ");
		list.printList();
		System.out.println();
	}

	public void addFrontToList() {
		list.addFront("Four");
		list.addFront("Five");
		System.out.print("The list with the added elements by in the begining: ");
		list.printList();
		System.out.println();
	}

	
	public void addByIndexToList() {
		if ((list.addByIndex("Six", 3)) && (list.addByIndex("Seven", 1))) {
			System.out.print("The list with the added elements by the index (3, 1): ");
			list.printList();
			System.out.println();
		}	
	}
	
	public void searchByIndexInList() {
		String result = "";
		try {
			result = list.searchByIndex(3);
		} catch (ListException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.print("The element of the index 2 is: " + result);
		System.out.println();
	}

	public void searchByValueInList() {
		boolean result = false;
		result = list.searchByValue("One");
		System.out.print("The element 'One' contains in the list: " + result);
		System.out.println();
	}
	
	public void deleteByValueFromList() {
		list.deleteByValue("Ten");
		list.deleteByValue("Four");
		list.deleteByValue("Seven");
		System.out.print("The list with the deleted elements by the value (Ten, Four, Seven): ");
		list.printList();
		System.out.println();
	}
	
	public void deleteByIndexFromList() {
		list.deleteByIndex(4);
		list.deleteByIndex(1);
		System.out.print("The list with the deleted elements by the index (4, 1): ");
		list.printList();
		System.out.println();
	}

}
