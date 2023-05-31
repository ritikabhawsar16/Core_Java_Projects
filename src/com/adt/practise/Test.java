package com.adt.practise;

public class Test {

	static void add(int arr[])
	{
		arr[0]=1;
		arr[1]=1;
	}
	
	public static void main(String[] args) {
		
		int arr[]=new int[2];
		add(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}

}
