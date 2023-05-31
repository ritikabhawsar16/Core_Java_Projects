package com.adt.task3;

import java.util.ArrayList;

import javax.sql.rowset.serial.SQLOutputImpl;

public class ArrayAscStringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     ArrayList<String> a=new ArrayList<String>();
     
     a.add("Tulsi");
     a.add("Lavika");
     a.add("Ritika");
     a.add("Dhvani");
     a.add("Chitra");
     a.add("Avitya");
     
     System.out.println("Before Sorting Elements are:- "+a);
     
     System.out.println("After Sorting Elements are:- ");
     
		
		a.stream().sorted().forEach(System.out::println);
	}

}
