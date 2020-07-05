package com.wipro.exceptions;

import java.util.*;
class ArrayNegativeException extends Exception
{
	public ArrayNegativeException(String s)
	{
		super(s);
	}
}
public class Ex3 {

	public static void main(String[] args) throws ArrayNegativeException {
		// TODO Auto-generated method stub
     String name1,name2;
     int []a=new int[3];
     int []b=new int[3];
     int avg1=0,avg2=0;
     Scanner sc=new Scanner(System.in);
     try {
    	 System.out.println("Enter the student 1 name:");
    	name1= sc.nextLine();
    	System.out.println("Enter the student 1 marks");
    	for(int i=0;i<3;i++)
    	{
    		a[i]=sc.nextInt();
    		if(a[i]<0)
    		{
    			throw new ArrayNegativeException("Negative Value in student 1");
    		}
    		if(!(a[i]>=0&&a[i]<=100))
    		{
    			throw new ArrayNegativeException("Value Out Of Range in student 1");
    		}
    		avg1=avg1+a[i];
    	}
   	 System.out.println("Enter the student 2 name:");
   	name2= sc.next();
   	System.out.println("Enter the student 2 marks");
	for(int i=0;i<3;i++)
	{
		b[i]=sc.nextInt();
		if(b[i]<0)
		{
			throw new ArrayNegativeException("Negative Value in student 2");
		}
		if(!(b[i]>=0&&b[i]<=100))
		{
			throw new ArrayNegativeException("Value Out Of Range in student 2");
		}
		avg2=avg2+b[i];
	}
	avg1=avg1/3;
	avg2=avg2/3;
	System.out.println(avg1+" "+avg2);
     }
     catch(NumberFormatException e)
     {
    	 System.out.println(e);
     }
     catch(ArrayNegativeException e)
     {
    	 System.out.println(e.getMessage());
     }
	}

}