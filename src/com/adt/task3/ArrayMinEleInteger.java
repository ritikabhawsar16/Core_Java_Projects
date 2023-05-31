package com.adt.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ArrayMinEleInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(15,50,26,10,43,78,33));
		
		int min = a.stream().min(Integer::compare).get();
		
		System.out.println("Minimum Element is : "+min);
		
	
	}

}

//System.out.println("Min. Element is: "+a.stream().sorted().find().get());
