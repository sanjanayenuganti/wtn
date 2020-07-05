package com.wipro.exceptions;
class InvalidCountryException extends Exception
{
public InvalidCountryException(String s)
{
	super(s);
}
}
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4 in=new Ex4();
		try
		{
          in.registerUser("sanju","india");
          in.registerUser("varni","us");
		}
		catch(InvalidCountryException ex)
		{
			System.out.println("caught");
			System.out.println(ex.getMessage());
		}
	}
	void registerUser(String name,String country) throws InvalidCountryException
	{
		if(!country.equals("india"))
		{
				throw new InvalidCountryException("User Outside india cannot be registered");
		}
		else
		{
			System.out.println("User registration done Successfully");
		}
	}
}