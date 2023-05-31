package com.adt.task5;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

//has a relationship example

class Company
{
	private int id;
	private String name;
	private boolean ispublic;
	private Department dept;
	
	public Company(int id, String name, boolean ispublic, Department dept) {
		
		this.id = id;
		this.name = name;
		this.ispublic = ispublic;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isIspublic() {
		return ispublic;
	}

	public void setIspublic(boolean ispublic) {
		this.ispublic = ispublic;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", ispublic=" + ispublic + ", dept=" + dept + "]";
	}
	
}

//--------------------------------------------------------------------------------
class Department 
{
	private int id;
	private String name;
	private Employee emp;
    
	public Department(int id, String name, Employee emp) {
	
		this.id = id;
		this.name = name;
		this.emp = emp;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", emp=" + emp + "]";
	}
}

//---------------------------------------------------------------------------
class Employee
{
	private int id;
	private String name;
	private String designation;
	
	public Employee(int id, String name, String designation) {
	
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
	
}

//-------------------------------------------------------------------------------------------
public class EmpSrJavaDev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee emp=new Employee(1, "Ritu", "SDE");
		Department dept=new Department(1, "Development",emp);
		Company com=new Company(1, "Alphadot", false, dept);
		
		
		Company company=new Company(1, "google", true, new Department(101, "Development", new Employee(201, "Ritika","Sr. Java Developer")));
		Company company2=new Company(2, "adobe", true, new Department(102, "Development", new Employee(202, "Aakash","Jr. Java Developer")));
		Company company3=new Company(3, "infosys", true, new Department(103, "Testing", new Employee(203, "Jyoti","Sr. java Developer")));
		Company company4=new Company(4, "advantal", false, new Department(104, "Development", new Employee(204, "shoaib","Sr. Java Developer")));
		Company company5=new Company(5, "engmas", false, new Department(105, "Networking", new Employee(205, "sanskriti","Sr. Developer")));
		 
		List<Company> list=new ArrayList<Company>();
		list.add(company);
		list.add(company2);
		list.add(company3);
		list.add(company4);
		list.add(company5);
		list.add(com);
		
		List<Company> newList= list.stream().filter(s->s.getDept().getEmp().getDesignation().equalsIgnoreCase("sr. java developer")).filter(s->s.isIspublic()).collect(Collectors.toList());		
		
		newList.stream().forEach(System.out::println);
		
	}

}
