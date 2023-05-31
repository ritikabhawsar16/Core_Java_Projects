package com.adt.task5;

import java.util.HashMap;

class Immutable
{
	private final int id;
	private final String name;
	
	HashMap<Integer, String> hs;

	public Immutable(int id, String name, HashMap<Integer, String> hs) {
	
		this.id = id;
		this.name = name;
		this.hs = hs;
	}
	
}

public class ImmutableExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
