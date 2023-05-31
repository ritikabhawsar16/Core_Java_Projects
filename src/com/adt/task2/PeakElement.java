package com.adt.task2;

public class PeakElement 
{
//	&& (a[b-1]<a[b-2])
	public static void main(String[] args)
 {
		 int a[]= {3,2,8,4,5,6};
		   int b=a.length;
		  
		   System.out.println("Peak Elements are:- ");
		   if(a[0]>a[1])
		   {
			   System.out.print(a[0]+" ");
		   }
   for(int i=1;i<b-1;i++)
   {
	   if( (a[i-1]<a[i]) && (a[i]>a[i+1]) )
	   {
		   System.out.print(a[i]+ " ");
	   } 
   }
   if(a[b-1]>a[b-2])
   {
	   System.out.print(a[b-1]+" ");
   }
 }

}

//--------------------------------------------------------
//&& (a[b-1]<a[b-2])
//for(int i=0;i<a.length;i++)
//{
//	   for(int j=i+1;j<a.length;j++)
//	   {
//		   for(int k=j+1;k<a.length;k++)
//		   {
//	          if( (a[j]<a[i]) && (a[j]>a[k])  )
//	           {
//		         System.out.print(a[i]+ " ");
//	           }
//		   }
//	   }
//}
//int a[]= {1,2,8,4,5,3,6};
//int b=a.length;