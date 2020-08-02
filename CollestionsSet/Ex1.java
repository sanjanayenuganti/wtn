package com.wipro.CollestionsSet;
import java.util.*;
public class Ex1 {
	HashSet<String> h1= new HashSet<>();
	HashSet<String> saveCountryNames(String CountryName)
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
		// TODO Auto-generated method stub
		Ex1 e=new Ex1();
		System.out.println("Saving Countries:");
		e.saveCountryNames("India");
		e.saveCountryNames("USA");
		e.saveCountryNames("South Africa");
		e.saveCountryNames("North Korea");
		e.saveCountryNames("Phillipines");
		System.out.println(e.saveCountryNames("Israel"));
		System.out.println("Get Countries:");
		System.out.println(e.getCountry("India"));
		System.out.println(e.getCountry("Japan"));
	}
}
