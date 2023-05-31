package com.adt.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountStrLngGrt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
ArrayList<String> list=new ArrayList<String>(Arrays.asList("hi","Jo","Rukmani","Devendra"));

//      List<Integer> list = Arrays.asList(1,2,34,156,2345,112,81,67,10,100,9);
      System.out.println("Strings whose length is greater then 3 are: "+list.stream().filter(n -> n.length()>3).count());
     // list.stream().filter(n->n.length()>3).forEach(System.out::println); 

	}

}
