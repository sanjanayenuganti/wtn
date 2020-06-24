package com.wipro.arrays;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {1,2,3};
		int[] b=new int[] {4,5,6};
		int n=a.length,N=2;
		int[] result=new int[2];
		result[0]=a[n/2];
		result[1]=b[n/2];
		System.out.print("[");
		for(int i=0;i<2;i++)
		{
			if(i!=(N-1))
			System.out.print(result[i]+"  ");
			else
				System.out.print(result[i]);
		}
		System.out.print("]");
	}

}
