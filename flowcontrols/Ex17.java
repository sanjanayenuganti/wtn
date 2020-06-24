package com.wipro.flowcontrols;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		int r,sum=0,temp;    
		  temp=n;    
		  while(n>0){    
		   r=n%10;  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(temp+" is a palindrome");    
		  else    
		   System.out.println(temp+" is not a palindrome"); 

	}

}
