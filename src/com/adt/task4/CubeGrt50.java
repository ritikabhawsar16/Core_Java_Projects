package com.adt.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class CubeGrt50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(0,1,2,9,25,97,16,45));
        
		System.out.println("Cube of Elements are:- ");
		list.stream().map(i->i*i*i).filter(i->i>50).forEach(System.out::println);

	}

}
