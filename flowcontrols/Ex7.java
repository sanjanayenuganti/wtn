package com.wipro.flowcontrols;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a=args[0].charAt(0);
		if(a>='a'&&a<='z')
		{
		char b=Character.toUpperCase(a);
		System.out.println(b);
		}
		else if(a>='A'&& a<='Z')
		{
		char c=Character.toLowerCase(a);
		System.out.println(c);
		}

	}

}
