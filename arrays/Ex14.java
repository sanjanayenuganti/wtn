package com.wipro.arrays;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=args.length;
		if(n==0||n<9)
			System.out.println("Please enter 9 integer numbers");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		int[][] r=new int[3][3];
		int k=0;
		while(k<n)
		{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				r[i][j]=a[k];
				k++;
			}
		}
		}
		int max=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(r[i][j]>max)
					max=r[i][j];
			}
		}
		System.out.println("The biggest number in the given array: "+max);
	}

}
