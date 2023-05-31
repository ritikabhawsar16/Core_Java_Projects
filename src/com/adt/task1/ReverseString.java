package com.adt.task1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str="RAMA";
		 String rev=" ";
		 int strleng=str.length();
		
	for(int i=(strleng-1);i>=0;i--)
	{
		rev= rev+str.charAt(i);
	}
		 
		 System.out.println("The Reverse of "+str+" is:- "+rev);
	}

}
