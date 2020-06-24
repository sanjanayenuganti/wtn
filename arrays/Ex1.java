package com.wipro.arrays;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{10,20,30,40,50};
		int sum=0;
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		double average= sum/n;
		System.out.println("Sum of array elements is "+sum);
		System.out.println("Average of array elements is "+average);

	}

}
