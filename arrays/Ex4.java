package com.wipro.arrays;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[] {97,69,105,79,117};
		String str=null;
		for(int i:a)
		{
			str = Character.toString((char)i);
			System.out.print(str+"  ");
		}

	}

}
