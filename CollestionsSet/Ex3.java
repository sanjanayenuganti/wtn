package com.wipro.CollestionsSet;
import java.util.*;
public class Ex3 {
	public static void main(String args[]) {
		Collection<String> t = new TreeSet<>(Collections.reverseOrder());
		t.add("Sanjana");
		t.add("Preethi");
		t.add("Sarru");
		t.add("Maggie");
        t.add("Fareena");
		Iterator<String> it = t.iterator();
		String s = "Harika";
		boolean result = false;
		
		while (it.hasNext()) {
			if (it.next().equals(s)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(s + " exists");
		else System.out.println(s + " doesn't exist");
	}
}
