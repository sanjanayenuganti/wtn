package com.wipro.encapsulationAbstraction;

public class Author {
	private String name;
	private String email;
	private String gender;
	Author(String name,String email,String gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	
	void setAuthorDetails(String name,String email,String gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	
	void getAuthorDetails(){
		System.out.println("Author Name: "+name+"\nAuthor Email: "+email+"\nGender: "+gender);
	}
}

class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	Book(String name,Author author,double price,int qtyInStock){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	
	void setBookDetails(String name,Author author,double price,int qtyInStock) {
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	void getBookDetails() {
		System.out.println("Book Name: "+name+"\nBook Price: "+price+"\nQuantity: "+qtyInStock);
		author.getAuthorDetails();
	}
}
