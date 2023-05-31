package com.adt.task3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayAscIntegerSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(05);
		a.add(92);
		a.add(33);
		a.add(45);
		a.add(10);
		a.add(23);
		a.add(57);

		System.out.println("Before Sorting Elements are:- "+a);
		
		System.out.println("After Sorting Elements are:- ");
		
		a.stream().sorted().forEach(System.out::println);
	}
}
