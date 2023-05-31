package com.adt.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class StartsWith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(100,15,50,26,43,10,78,33,13,19));
		
		
		a.stream().map(s->s+" ").filter(s->s.startsWith("1")).forEach(System.out::println);
		
	}

}
