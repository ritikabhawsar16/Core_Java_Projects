package com.adt.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ArrayMaxString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
	ArrayList<String> a=new ArrayList<String>(Arrays.asList("hello","every","one","I","am","RitikaBhawsar"));
		
		String max = a.stream().max(Comparator.comparing(String::length)).get();
		
		System.out.println("maximum by alphabet : "+max);
		
	String max1 = a.stream().max(Comparator.comparing(String::valueOf)).get();
		
		System.out.println("maximum by alphabet : "+max1);
		
		
//	String max = Stream.of("Bhawsar","Aarav","Yash","Bittu","Chetana")
//			.max(Comparator.comparing(String::valueOf)).get();
//	System.out.println("maximum by alphabet : "+max);
//	
//	String max1 = Stream.of("jyoti","ritika","akash","shoaib","deepanshu")
//			.max(Comparator.comparing(String::length)).get();
//	System.out.println("maximum by alphabet : "+max1);
//	
	
	}

}
