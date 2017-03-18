package com.epam.java.mylist;

public class Main {

	public static void main(String[] args) {
		MyList ml = new MyList();
		ml.addBack("One");
		ml.addBack("Two");
		ml.addBack("Three");
		System.out.print("The list with the added elements by in the end: ");
		ml.printList();
		System.out.println();
	
		ml.addFront("Four");
		ml.addFront("Five");
		System.out.print("The list with the added elements by in the begining: ");
		ml.printList();
		System.out.println();
		
		ml.addMiddle("Six");
		ml.addMiddle("Seven");
		System.out.print("The list with the added elements by in the middle: ");
		ml.printList();
		System.out.println();
		
		ml.deleteByValue("Eight");
		ml.deleteByValue("Four");
		ml.deleteByValue("Seven");
		System.out.print("The list with the deleted elements by the value (Eight, Four, Seven): ");
		ml.printList();
		System.out.println();
		

		ml.deleteByIndex(1);
		ml.deleteByIndex(4);
		System.out.print("The list with the deleted elements by the index (1, 4): ");
		ml.printList();
		System.out.println();
	}
}
