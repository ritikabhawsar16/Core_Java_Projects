package com.adt.task2;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] a= {5,3,4,1,2,6};
    int temp=0;
    
         for(int i=0;i<a.length;i++)
          {
    	    for(int j=i+1;j<a.length;j++)
    	    {
    	    	if(a[i]>a[j])
    	    	{
    	    		//Swapping
    	    		temp=a[i];
    	    		a[i]=a[j];
    	    		a[j]=temp;
    	    	}
    	    }
          }
         System.out.println("After Sorting the original Array:- ");
         
         //print the sorting elements
         for(int i=0;i<a.length;i++)
         {
        		 System.out.print(a[i]+" ");
        		 
         }
         
	}

}
