package com.wipro.strings;
public class s6 {
public static void main(String[] args) {
	String hello = "";
	String a=hello;
	String world = "";
	String b=world;
	  String result = "";
	  int i = 0;
	  while (i<a.length()&&i<b.length()){
	  result = result + a.charAt(i) + b.charAt(i);
	  i++;
	  }
	  result= result+a.substring(i)+b.substring(i);
}
}