package com.wipro.CollectionsList;
import java.util.*;
public class Ex3 {
	static void printAll(ArrayList<String> t)
	{
		Iterator<String> it=t.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<String>();
		s.add("Sanju");
		s.add("Preethi");
		s.add("Meghana");
		s.add("Fareena");
		s.add("Pravallika");
		s.add("Tejaswini");
		printAll(s);
	}
}
