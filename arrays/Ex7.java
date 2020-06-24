package com.wipro.arrays;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {12,34,12,45,67,89};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					for(int k=j; k<n&&(k+1)<n; k++)
	                {
	                    a[k] = a[k + 1];
	                }
					n--;
					j--;
				}
			}
		}
		for(int p=0;p<n;p++)
		System.out.print(a[p]+"  ");
	}

}
