package com.adt.practise;

public class RecursionExample1 {

	static void print(int i) {
		if(i==0)
			return;

		System.out.print(" "+(i));
		print(--i);
	}
	public static void main(String[] args) {
//		for(int i=1;i<=10;i++) {
//			System.out.print(" "+i);
//		}
		print(5);
	}

}
