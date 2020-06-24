package com.wipro.arrays;

public class Ex5 {

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
		System.out.println("First largest number in the array is "+a[n-1]);
		System.out.println("Second largest number in the array is "+a[n-2]);
		System.out.println("First smallest number in the array is "+a[0]);
		System.out.println("Second smallest number in the array is "+a[1]);
	}

}
