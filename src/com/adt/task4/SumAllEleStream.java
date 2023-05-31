package com.adt.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class SumAllEleStream {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		System.out.println("Sum of all elements of list is: ");
		System.out.println(list.stream().mapToInt(s->s).sum());
		
	}

}
