package com.adt.practise;

public class PrimeNumberPgr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int no=5;
		//int no=96;
		//int no=45;
		//int no=13;
		
		int no=7;
		int temp=0;
		
		for(int i=2;i<=(no-1);i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println(no+" No. is Prime Number");
		}
		else
		{
			System.out.println(no+" No. is not a Prime Number");
		}

	}

}
