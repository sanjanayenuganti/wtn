package com.wipro.CollectionsList;
import java.util.*;
class Emp
{
	private int id;
	private String name;
	private String email;
	private float salary;
	public Emp(int id,String name,String email,float salary)
	{
		super();
		this.id=id;
		this.name=name;
		this.email=email;
		this.salary=salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id=" + id + ", Name=" + name + ",Emailid=" + email + ", Salary=" + salary;
	}
	
}
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Emp> vec=new Vector<>();
		vec.add(new Emp(1001,"Sanjana","sanju@gmail.com",80000.0F));
		vec.add(new Emp(1002,"Preethi","preethi@gmail.com",70000.0F));
		vec.add(new Emp(1003,"Meghana","maggie@gmail.com",60000.0F));
		vec.add(new Emp(1004,"Pravallika","sarru@gmail.com",50000.0F));
		vec.add(new Emp(1005,"Fareena","ferro@gmail.com",40000.0F));
		System.out.println("Using Iterator:");
		Iterator<Emp> it=vec.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("Using Enumeration:");
		Enumeration<Emp> e=Collections.enumeration(vec);
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
	}

}
