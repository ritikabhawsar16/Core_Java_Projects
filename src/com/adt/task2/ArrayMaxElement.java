package com.adt.task2;

public class ArrayMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {5,-12,0,8,10,-6,3,55};
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
				if(max<arr[i])
				{
					max=arr[i];
				}
		}
		System.out.println("Minimum Element in array is: "+max);
	}
	}
