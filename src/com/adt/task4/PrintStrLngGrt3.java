package com.adt.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintStrLngGrt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<String> list=new ArrayList<String>(Arrays.asList("hii","Jo","Rukmani","Devendra"));

 list.stream().filter(n->n.length()>3).forEach(System.out::println); 
	}

}
