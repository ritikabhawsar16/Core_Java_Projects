package com.adt.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee
{
	  int id;
	  String Name;
	  Long ConNum;
	  String Gender;
	  int age;
	  String Address;
	  
	  //------------------------constructor-----------------------------------------
	public Employee(int id, String name, long i, String gender, int age, String address) {
		
		this.id = id;
		Name = name;
		ConNum = i;
		Gender = gender;
		this.age = age;
		Address = address;
	}
	
	//----------------------------getter/setter---------------------------------------
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return Name;
	}
	
	
	public void setName(String name) {
		Name = name;
	}
	
	
	public Long getConNum() {
		return ConNum;
	}
	
	
	public void setConNum(Long conNum) {
		ConNum = conNum;
	}
	
	
	public String getGender() {
		return Gender;
	}
	
	
	public void setGender(String gender) {
		Gender = gender;
	}
	
	
	public int getAge() {
		return age;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getAddress() {
		return Address;
	}
	
	
	public void setAddress(String address) {
		Address = address;
	}
	
	//------------------------tostring-------------------------------------------
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", ConNum=" + ConNum + ", Gender=" + Gender + ", age=" + age
				+ ", Address=" + Address + "]";
	}
}

//-------------------------main method--------------------------------------------
public class RegistrationForm 
{

	public static void main(String[] args)
	{
		
		
		List<Employee> list=new ArrayList<Employee>();
		
		Scanner s=new Scanner(System.in);
		boolean b=true;

		 do{
			
			System.out.println("Enter your Name :- ");
			String name=s.nextLine();

			s.nextLine();
			System.out.println("Enter your Id :- ");
			int id=s.nextInt();

			System.out.println("Enter your Contact No. :- ");
			long phone=s.nextLong();

			System.out.println("Enter your Age :- ");
			int age=s.nextInt();

			System.out.println("Enter your Gender :- ");
			String gender=s.nextLine();
			         
			s.nextLine();
			System.out.println("Enter your Address :- ");
			String address=s.next();
			
			Employee e=new Employee(id, name, phone, gender, age, address);
			list.add(e);
			
			System.out.println("Registration Succesfull...");
			
			System.out.println("Do you want to Register another Employee ? ");
			System.out.println("Enter your Choice :- ");
			char ch=s.next().charAt(0);
			
			
			if(ch=='y' || ch=='Y')
			{
				continue;
			}
			else if(ch=='n' || ch=='N')
			{
				b=false;
				System.out.println("...No further entries...");
				break;
			}
			else
			{
				System.out.println("...Invalid Choice...");
				break;
			}
			
			
			}
		 
		 
		 while(b);
		 
			System.out.println(list); 
		 
		
		
	}

}

/*	
System.out.println("Do you want to enter the entries ? ");

Scanner s1=new Scanner(System.in);
System.out.println("Enter your Choice :- ");
ch=s1.next().charAt(0);

*/