package com.adt.task2;

public class ArrayMinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-2,5,7,8,6,9,1,0,-4};
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
				if(min>arr[i])
				{
					min=arr[i];
				}
		}
		System.out.println("Minimum Element in array is: "+min);
		
	}

	}


