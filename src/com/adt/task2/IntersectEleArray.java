package com.adt.task2;

public class IntersectEleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a[]= {1,2,3,4,5,6,7};
          int b[]= {7,8,9,1,2,3,0,0};
          int c[]=new int[a.length];
          int k=0;
          
          for(int i=0;i<a.length;i++)
          {
        	  for(int j=0;j<b.length;j++)
        	  {
        		  if(a[i]==b[j])
                  {
                	  c[k]=b[j];
                	  k++;
                  }
        	  }
          }
          
          System.out.println("Intersection of Array(A & B) is: ");
          for(int p=0;p<k;p++)
          {
        	  System.out.print(c[p]+" ");
          }
          
	}

}
