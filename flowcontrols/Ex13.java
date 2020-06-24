package com.wipro.flowcontrols;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int I=10,n=99,c=0;
		for(int i=I+1;i<n;i++)
		{
			for(int j=2;j<=(i/2);j++)
			{
				if(i%j==0)
				{
					c=1;
					i++;
					break;
				}
				else
				{
					c=0;
					continue;
				}
			}
			if(c==0)
			{
				System.out.print(i+" ");
				i++;
			}
		}

	}

}
