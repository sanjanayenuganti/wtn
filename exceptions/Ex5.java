package com.wipro.exceptions;
class AgeException extends Exception
{
	public AgeException(String s)
	{
		super(s);
	}
}
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name=args[0];
     int age=Integer.parseInt(args[1]);
     try {
    	 if(age>=18&&age<60)
    	 {
    		 System.out.println("Entered successfully");
    	 }
    	 else
    	 {
    		 throw new AgeException("Age is Invalid");
    	 }
     }
     catch(AgeException e)
     {
    	 System.out.println(e.getMessage());
     }
	}

}