package com.adt.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayMinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<String> a=new ArrayList<String>(Arrays.asList("hi","hello","every","one","Ijjfgj","am","Ritika"));
		
		String min = a.stream().min(Comparator.comparing(String::length)).get();
		
		System.out.println("Minimum Element are: "+min);
		
//	String min1 = a.stream().min(Comparator.comparing(String::valueOf)).get();
//		
//		System.out.println("Minimum Element are: "+min1);
		
	}

}
