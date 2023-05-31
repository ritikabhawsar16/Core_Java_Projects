package com.adt.practise;

public class ReverseNumberExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int n=5432;
	
		int s=0;
		int r;
		while(n!=0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		
		System.out.println("After reverse the no.:- "+s);
		
	}

}
