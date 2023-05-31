package com.adt.task2;

public class MoveNegativeEle {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		int[] a= {5,-3,-4,1,2,-6};
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
//     int a[]= {-4,5,-7,-6,2,3,-1,0,8,9};
//     int b[]=new int[a.length];
//   
//     for(int i=0;i<a.length;i++)
//     {
//     if(a[i]<0)
//     {
//    	b[i]=a[i];
//    	
//     } 
//     }
//      System.out.println("Negative Elements of given array are: ");
//      
//      //print 
//      for(int i=0;i<b.length;i++)
//      {
//    	  System.out.print(b[i]+" ");
//      }
////		
//////		
	}
}

//------------------------------------------------------------

//class Student implements Cloneable{
//	int roll;
//	String name;
//	public Student(){
//		roll=0;
//		name=null;
//	}
//	public Student(int roll,String name){
//		this.roll=roll;
//		this.name=name;
//	}
//	public Student(Student stud){
//		this.roll=stud.roll;
//		this.name=stud.name;
//	}
//	@Override
//	public String toString() {
//		return "Student [roll=" + roll + ", name=" + name + "]";
//	}
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
//}

//Student obj1=new Student();
////Student obj2=new Student(1,"Jyoti");
////Student obj3=new Student(obj2);
////
////
////System.out.println(obj1.hashCode());
////System.out.println(obj2.hashCode());
////System.out.println(obj3.hashCode());
////Student obj4= (Student) obj3.clone();
////System.out.println(obj4.hashCode());
//
//
//
//int i=10;
//System.out.println(i);
//Integer I=i;
//System.out.println(I.compareTo(10));
//