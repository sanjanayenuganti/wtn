package com.wipro.overridingPolymorphism;

public class FruitMainClass {
	public static void main(String[] args) {
		Fruit app=new Apple("Apple","Sweet","B");
		Fruit or=new Orange("Orange","Sour","S");
		app.eat();
		or.eat();
	}
}
