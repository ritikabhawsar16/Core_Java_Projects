package com.adt.task1;

import java.util.Scanner;

                              //using parameterised constructor

public class RegistrationForm1 {
	String name;
	int id;
	long phone;               
	int age;
	String gender;
	String address;
	
	RegistrationForm1(String name,int id,long phone,int age,String gender,String address)
	{
		this.name=name;
		this.id=id;
		this.phone=phone;
		this.age=age;
		this.gender=gender;
		this.address=address;
	}
	
	void empdetails()
	{
		 System.out.println("Employee Name is :- "+name);
		    System.out.println("Employee Id is :- "+id);
		    System.out.println("Employee Contact no. is :- "+phone);
		    System.out.println("Employee Age is :- "+age);
		    System.out.println("Employee Gender is :- "+gender);
		    System.out.println("Employee Address is  :- "+address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegistrationForm1 rf=new RegistrationForm1("Ankit",11,1234567890,21,"Male","Indore");
		
		rf.empdetails();
	}

}
//----------------------------------------------------------------------------------
                 //Using Interface

//interface Employee
//{
//       void empdetails();
//}
//class Emp implements Employee
//{
//   public void empdetails()
//   {
//	   Scanner s=new Scanner(System.in);
//	    System.out.println("Enter your Name :- ");
//	    String name=s.nextLine();
//
//	    
//	    System.out.println("Enter your Id :- ");
//	    int id=s.nextInt();
//	    
//	  
//	    System.out.println("Enter your Contact No. :- ");
//	    long phone=s.nextLong();
//	    
//	    
//	    System.out.println("Enter your Age :- ");
//	    int age=s.nextInt();
//	    
//	  
//	    System.out.println("Enter your Gender :- ");
//	    String gender=s.next();
//	    
//	      s.nextLine();
//	    System.out.println("Enter your Address :- ");
//	    String address=s.nextLine();
//        
//	    System.out.println("Employee Name is :- "+name);
//	    System.out.println("Employee Id is :- "+id);
//	    System.out.println("Employee Contact no. is :- "+phone);
//	    System.out.println("Employee Age is :- "+age);
//	    System.out.println("Employee Gender is :- "+gender);
//	    System.out.println("Employee Address is  :- "+address);
//   }
//
//}
//public class RegistrationForm1{
//	public static void main(String[] args)
//	{
//		Emp e=new Emp();
//		e.empdetails();
//	}
//}























