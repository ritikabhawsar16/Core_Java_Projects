package com.adt.practise;

public class PrimeNum100Pgr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Prime Numbers upto 100 are:- ");
		
		for(int no=1;no<=100;no++)
		{
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
				System.out.print(no+"  ");
			}
		}
	}

}
