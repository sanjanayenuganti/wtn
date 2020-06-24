package com.wipro.arrays;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{100,40,20,80,60};
		int n=a.length;int min=a[0],max=-1;
		for(int i=0;i<n;i++)
		{
			if(a[i]<min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Maximum value of the array is "+max);
		System.out.println("Minimum value of the array is "+min);

	}

}
