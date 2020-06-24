package com.wipro.flowcontrols;

public class Ex1A {
	public static void main(String[] args) {
	int x=Integer.parseInt(args[0]);
	if(x<=0) {
		System.out.println("Negative");
	}
	else if(x==0) {
		System.out.println("Zero");
	}
	else {
		System.out.println("Positive");
	}
}
}