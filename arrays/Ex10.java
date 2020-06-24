package com.wipro.arrays;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {1,0,1,0,0,1,1}; 
		int n=a.length,c=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				c++;
				System.out.print(a[i]+",");
			}
		}
		for(int j=0;j<n;j++)
		{
			if(a[j]%2 != 0 && c!=n-1)
			{
				c++;
				System.out.print(a[j]+",");
			}
			else if(a[j]%2 != 0 && c==n-1)
				System.out.print(a[j]);
		}
	}

}
