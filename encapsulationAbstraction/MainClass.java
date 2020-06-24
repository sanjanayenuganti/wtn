package com.wipro.encapsulationAbstraction;

public class MainClass {

	public static void main(String[] args) {
		Author author=new Author("Sanjana", "xyzz@gmail.com","Female");
		Book B=new Book("Wings of fire",author,400,2);
		B.getBookDetails();
	}

}
