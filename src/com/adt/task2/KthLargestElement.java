package com.adt.task2;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KthLargestElement {

	public static void main(String[] args) {
     Integer a[]= {1,4,5,2,6,3,9,9,10,5,2,0,0};
     Arrays.sort(a);
     System.out.println("sorted Array ::"+Arrays.toString(a));
     
     Set<Integer> hs=new HashSet<Integer>();
     Collections.addAll(hs,a);
     System.out.println("elements added in set: "+hs);
     
   	 List<Integer> li=new ArrayList<Integer>(hs);
	System.out.println("third highest element - "+li.get(li.size()-3));
//     System.out.println("2nd highest element of array is : "+a[size-2]);
	}
}
