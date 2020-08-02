package com.wipro.CollestionsSet;
import java.util.*;

public class Ex4 {
	TreeSet<String> h1= new TreeSet<>();
	TreeSet<String> saveCountryNames(String CountryName)
	{
		h1.add(CountryName);
		return h1;
	}
	String getCountry(String CountryName)
	{
		Iterator<String> i=h1.iterator();
		while(i.hasNext())
		{
			if(i.next().equals(CountryName))
				return CountryName;
		}
		return null;
	}
	public static void main(String[] args) {
		Ex1 e=new Ex1();
		System.out.println("Saving Countries:");
		System.out.println(e.saveCountryNames("India"));
		System.out.println(e.saveCountryNames("USA"));
		System.out.println(e.saveCountryNames("South Africa"));
		System.out.println(e.saveCountryNames("North Korea"));
		System.out.println(e.saveCountryNames("Phillipines"));
		System.out.println(e.saveCountryNames("Israel"));
		System.out.println("Get Countries:");
		System.out.println(e.getCountry("India"));
		System.out.println(e.getCountry("Japan"));
	}
}

