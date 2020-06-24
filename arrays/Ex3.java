package com.wipro.arrays;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {1,4,34,56,7};
		int n= a.length,c=0,b=0;
		int s=Integer.parseInt(args[0]);
		for(int i=0;i<n;i++)
		{
			if(a[i]==s)
			{
				c=1;
				b=i;
				break;
			}
		}
		if(c==1)
			System.out.println(b);
		else
			System.out.println("-1");
	}

}
