package com.adt.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(50,10,20,10,35,89,35,10));
		
//		a.stream().map(s->s+" ").filter(s->s.replaceAll(a,a)).forEach(System.out::println);
		a.stream().distinct().forEach(System.out::println);
	}

}
