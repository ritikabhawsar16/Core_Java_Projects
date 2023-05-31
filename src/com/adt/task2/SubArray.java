package com.adt.task2;

public class SubArray {

	public static void main(String[] args) {
		
		int a[]= {1,3,2,4,5,6,1,8,9,2,3};
		int c=0;
		
		//length=11

		for(int i=0;i<a.length-1;i++)
		{
			
			if( a[i]+a[i+1]==5)
			{
				System.out.println(a[i]+" "+a[i+1]);
			}
			else if (a[i]+a[i+1]<10)
			{
				c=a[i]+a[i+1]+a[i+2];
				  
				if((a[i]+a[i+1]+a[i+2])==10)
				{
					System.out.println(a[i]+" "+a[i+1]+" "+a[i+2]);
				}
				else if((a[i]+a[i+1]+a[i+2]+a[i+3])==10)
				{
					//c=c+a[i+3];
					c=a[i]+a[i+1]+a[i+2]+a[i+3];
					System.out.println(a[i]+" "+a[i+1]+" "+a[i+2]+" "+a[i+3]);
				}
				else if((a[i]+a[i+1]+a[i+2]+a[i+3])<10)
			{
				//c=c+a[i+3];
				c=a[i]+a[i+1]+a[i+2]+a[i+3]+a[i+4];
				System.out.println(a[i]+" "+a[i+1]+" "+a[i+2]+" "+a[i+3]+" "+a[i+4]);
			}
				else
				{
					//c=c-a[i];
					c=a[i]+a[i+1]+a[i+2]+a[i+3]-a[i];
					System.out.println(a[i+1]+" "+a[i+2]+" "+a[i+3]);
				}
				
				System.out.println(a[i]+" "+a[i+1]+" "+a[i+2]+" "+a[i+3]);
			}
			else
			{
				//c=c-a[i+1];
				c=a[i]+a[i+1]+a[i+2]-a[i+1];
				//System.out.println(a[i+1]+" "+a[i+2]);
				System.out.println(a[i]+" "+a[i+2]+" "+a[i+3]);
			}
			
			
		}
	
	}

}

//------------------------------------------------------------

//TODO Auto-generated method stub
//int a[]= {2,1,3,4,5};
//int count=0;
//
//for (int i = 0; i < a.length; i++)
//{
//	count =count+a[i];
//	
//	if(count==5)
//	{
//		System.out.println(count);
//	}
//}
//
//------------------------------------------------		
//	int a[]= {1,2,3,2,4,5,1,2};
//	int c=0;
//	for (int i = 0; i < a.length; i++) 
//	{
//		for (int j = i+1; j < a.length; j++) 
//		{
//			if(a[i]+a[j]==5)
//			{
//			System.out.println(a[i]+" "+a[j]);
//			}
//		}
//	}