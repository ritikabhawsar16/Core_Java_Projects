package com.adt.task3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayDescStringSort {

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
	     
			
			a.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
