package com.adt.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class ArrayMaxEleInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(15,50,26,100,43,78,33));
		
	int max = a.stream().max(Integer::compare).get();
		
		System.out.println("Max Element is : "+max);
		 
		
//		System.out.println(maxNumber+" "+minNumber);
		
		//Stream.of(a).max(Comparator.comparing(Integer::valueOf)).get();		

		
	//Stream<Integer> ss= a.stream().min(i,j)-> i.compareTo(j).get();
	//System.out.println("Max. Element is: "+a.stream().sorted().findFirst().get());
		
		
//	
		
	}

}
