package com.adt.practise;

public class LeapYearPgr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int year=2015;
		//int year=2016;
		//int year=2017;
		//int year=2018;
		//int year=2019;
		//int year=2020;
		//int year=2021;
		//int year=2022;
		
		int year=2023;
		
		if( (year%400==0) || (year%4==0 && year%100!=0) )
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}

}
