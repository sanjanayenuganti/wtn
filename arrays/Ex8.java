package com.wipro.arrays;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {10,3,6,1,2,7,9};
		int n=a.length,six=0,seven=0,sum=0;
		for(int k=0;k<n;k++)
		{
			if(a[k]==6)
				six=k;
			if(a[k]==7)
				seven=k;
		}
		if(seven>six)
		{
		for(int i=0;i<n;i++)
		{
			if(i<six || i>seven)
			sum += a[i];
		}
		}
		System.out.println(sum);

	}

}
