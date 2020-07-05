package com.wipro.exceptions;
import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of elements: ");
	    int n=sc.nextInt();
	    System.out.println("Enter the elemnets in array: ");
	    int []a=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	try {
	    	a[i]=sc.nextInt();
	    	}
	    	catch(NumberFormatException e)
	    	{
	    		System.out.println(e);
	    	}
	    }
	    System.out.println("Enter the index of the element you want to access: ");
	    int index=sc.nextInt();
	    try {
	    	int d=a[index];
	    	System.out.println("The array element at index "+index+" = "+d);
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	    	System.out.println(e);
	    	System.exit(0);
	    }

	    	System.out.println("The array element successfully accessed");

	}

}
