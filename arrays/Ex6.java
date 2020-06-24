package com.wipro.arrays;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {3,6,1,8,4};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]<a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
	for(int p=0;p<n;p++)
	System.out.print(a[p]+"  ");
	}

}
