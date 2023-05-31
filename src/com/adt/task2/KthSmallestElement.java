package com.adt.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Integer a[]= {2,5,1,3,4,7,6,7,8,8};
 
  Arrays.sort(a, Collections.reverseOrder());
  
  System.out.println("Sorted & Reverse Array: "+Arrays.toString(a));
  
  Set<Integer> hs=new HashSet<Integer>();
  Collections.addAll(hs,a);
  System.out.println("Elements added in set: "+hs);
  
  List<Integer> li=new ArrayList<Integer>(hs);
 	System.out.println("3rd Smallest element - "+li.get(li.size()-3));
	}

}
