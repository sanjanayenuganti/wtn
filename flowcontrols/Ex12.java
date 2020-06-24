package com.wipro.flowcontrols;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(args[0]);
		int c=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				c=0;
				break;
			}
			else 
				c=1;
		}
		if(c==1)
			System.out.println("Prime");

	}

}
