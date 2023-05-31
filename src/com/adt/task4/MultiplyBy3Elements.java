package com.adt.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyBy3Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,9,97,16,45));
        
        System.out.println("After Multiply by 3 in all elements:- ");
        list.stream().map(i->i*3).forEach(System.out::println);
	
	}
	

}
