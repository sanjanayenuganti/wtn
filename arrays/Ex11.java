package com.wipro.arrays;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {1,4,1,2,4};
		int n=a.length,c=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==4 ||a[i]==1)
			{
				c=1;
			}
			else
			{
				System.out.println("false");
				c=0;
				break;
			}
		}
		if(c==1)
		System.out.println("true");
	}

}
