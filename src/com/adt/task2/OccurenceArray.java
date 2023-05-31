package com.adt.task2;

import java.util.Scanner;

public class OccurenceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]= {1,5,8,8,4,2,1,0,0,9,1,5,6,9}; 
   int count=0;
   
   Scanner s=new Scanner(System.in);
   System.out.println("Enter No. which you wanna know the occurence of that no.:- ");
   int n=s.nextInt();
   
   for(int i=0;i<a.length;i++)
   {
	   if(n==a[i])
	   {
		   count++;
	   }
   }
   
   if(n!=0)
   {
	   System.out.println("The occurence of "+n+" is: "+count);
   }
   else
   {
	   System.out.println("Entered no. is not present in given array");
   }
   
	}

}
