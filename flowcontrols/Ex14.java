package com.wipro.flowcontrols;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= Integer.parseInt(args[0]),sum=0;
		if(a==0)
			System.out.println(a);
		while(a!=0)
		{
			int r=a%10;
			sum += r;
			a=a/10;
		}
		System.out.println(sum);

	}

}
