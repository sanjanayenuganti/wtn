package com.wipro.flowcontrols;

public class Ex1B {

	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		if(x%10==y%10) {
			System.out.print("lastDigit("+args[0]+", "+args[1]+") ->"+true);
		}
		else {
			System.out.print("lastDigit("+args[0]+", "+args[1]+") ->"+false);
		}

	}

}
