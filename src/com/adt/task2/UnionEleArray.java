package com.adt.task2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnionEleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {1,3,5,7,80,20};
		Integer b[]= {5,7,20,40,60,80};
		Integer c[]=new Integer[a.length+b.length];
		
		//copy of a into c
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		
		//copy of b into c
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		
		System.out.println("After adding elements in a single array: ");
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	    
		System.out.println();
		  Set<Integer> hs=new HashSet<Integer>();
		  Collections.addAll(hs,c);
		  System.out.print("Union of Array(A & B) is: "+hs);
		  

		//print array_element of c
	
	}

}
