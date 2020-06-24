package com.wipro.arrays;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=args.length;
		if(n==0||n<4)
			System.out.println("Please enter 4 integer numbers");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		int[][] r=new int[2][2];
		int k=0;
		while(k<n)
		{
		for(int i=1;i>=0;i--)
		{
			for(int j=1;j>=0;j--)
			{
				r[i][j]=a[k];
				k++;
			}
		}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(r[i][j]+" ");
			}
			System.out.println("");
	}

	}
}
