package com.adt.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamConcatenateExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(33,75,16,45,25,50));
		ArrayList<Integer> list2=new ArrayList<Integer>(Arrays.asList(11,57,01,45,89,60));
		
		Stream.concat(list1.stream(),list2.stream()).distinct().forEach(System.out::println);
		
		//list1.stream();
		
	}

}
