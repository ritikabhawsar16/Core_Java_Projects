package com.adt.task1;

public class ReverseStringRecurrsion
{
	
	public static String reverseString(String str)
	{
		if(str.isEmpty())
		{
			
			return str;
		}
		else
		{
			return reverseString(str.substring(1))+str.charAt(0);
		}
	
	}
	public static void main(String[] args)
	{
		ReverseStringRecurrsion rstr=new ReverseStringRecurrsion();
		
		String str1=rstr.reverseString("Ritika");
		System.out.println("Reverse of given String is: "+str1);
		
		// TODO Auto-generated method stub
//	 String str="";
//		String rstr= reverseString("Ritika"," ",str.length());
//		int no=5;
//		int sum=1;
//		for(int i=1;i<=no;i++) {
//			sum=sum*i;
//		}
//		System.out.println(fact(5));
//	}
//	static int fact(int no){
//		if(no==0)
//			return 1;
//		return no*fact(no-1);
	}
/*
 *  fact(5){
		if(5==0)
			return 1;
		return 5*24
	}
 * ===================
 *  fact(4){
		if(4==0)
			return 1;
		return 4*6
	}
	========================
	
	 fact(3){
		if(3==0)
			return 1;
		return 3*2
	}
	=============================
	 fact(2){
		if(2==0)
			return 1;
		return 2*1
	}
	=========================
	 fact(1){
		if(1==0)
			return 1;
		return 1*1
	}
	===================
	 fact(0){
		if(0==0)
			return 1;
		return 0*fact(0-1); ->fact(-1)
	}
 * */
}
