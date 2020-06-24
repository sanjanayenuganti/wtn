package com.wipro.flowcontrols;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		while(a!=0)
		{
			int r=a%10;
			System.out.print(r);
			a=a/10;
		}

	}

}
