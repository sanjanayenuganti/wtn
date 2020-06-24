package com.wipro.overridingPolymorphism;

public class Fruit {
	String name;
	String taste;
	String size;
	Fruit(String name,String taste,String size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat() {
		System.out.println("Fruit Name:"+name+",Taste:"+taste);
	}
}

class Apple extends Fruit{
	Apple(String name,String taste,String size){
		super(name,taste,size);
	}
	void eat() {
		System.out.println("Fruit Name:"+name+",Taste:"+taste);
	}
}

class Orange extends Fruit{
	Orange(String name,String taste,String size){
		super(name,taste,size);
	}
	void eat() {
		System.out.println("Fruit Name:"+name+",Taste:"+taste);
	}
}
