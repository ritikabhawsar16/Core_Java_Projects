package com.adt.task3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayDescIntegerSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(19);
		a.add(55);
		a.add(23);
		a.add(48);
		a.add(76);
		a.add(88);
		
		System.out.println("Before Sorting:- "+a);
		
		System.out.println("After Sorting:- ");
		a.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
