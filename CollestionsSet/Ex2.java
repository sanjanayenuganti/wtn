package com.wipro.CollestionsSet;
import java.util.*;
public class Ex2 {
	public static void main(String args[]) {
		HashSet<String> H1 = new HashSet<>();
		H1.add("Sanjana");
		H1.add("Preethi");
		H1.add("Meghana");
		H1.add("Pravallika");
		H1.add("Fareena");
		Iterator<String> it = H1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
