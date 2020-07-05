package com.wipro.exceptions;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int[5];
	     int sum=0,avg=0;
	     for(int i=0;i<5;i++) {
	     try
	     {
	    	a[i] =Integer.parseInt(args[i]);
	    	sum=sum+a[i];
	     }
	     catch(NumberFormatException e)
	     {
	    	 System.out.println(e);
	     }
	     }
	     try
	     {
	    	 avg=sum/a.length;
	     }
	     catch(ArithmeticException e)
	     {
	    	 System.out.println(e);
	     }
	     System.out.println("The average and summation of Numbers is: "+avg+" "+sum);
	}

}
