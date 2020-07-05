package com.wipro.strings;
import java.util.*;
public class Palindrome {
public static void main(String[] args) {
String s="madam";
String a="";
int n=s.length()-1;
for(int i=n;i>=0;i--)
{
	a=a+s.charAt(i);
}
if(s.contentEquals(a))
{
	System.out.println("Palindrome");
}
else {
	System.out.println("Not a Palindrome");
}
}
}