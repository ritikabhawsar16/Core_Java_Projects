package com.adt.task2;

public class Sorting_0s_1s_2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int a[]= {0,2,1,2,1,0,1,2,0};
		
		int c1=0;
		int c2=0;
		int c3=0;
		
		//Condition check 
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				c1++;
			}
			else if(a[i]==1)
			{
				c2++;
			}
			else
			{
				c3++;
			}
		}
		
		//assign the values
		for(int i=0;i<c1;i++)
		{
			a[i]=0;
		}
		for(int i=c1;i<(c1+c2);i++)
		{
			a[i]=1;
		}
		for(int i=(c1+c2);i<a.length;i++)
		{
			a[i]=2;
		}
		
		System.out.println("After Sort 0s,1s,2s from given Array Elements are:-");
		//print the elements
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
	}

}
