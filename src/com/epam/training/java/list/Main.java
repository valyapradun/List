package com.epam.training.java.list;

public class Main {

	public static void main(String[] args) {
		Service service = new Service();

		service.addBackToList();
		service.addFrontToList();
		service.addByIndexToList();
		service.searchByIndexInList();
		service.searchByValueInList();
		service.deleteByValueFromList();
		service.deleteByIndexFromList();
	}
}
