package com.btree;

public class Test {
	
	private static void newName(String name){
		name = name+"jha";
	}

	public static void main(String[] args) {
		String name = "Sachin ";
		newName(name);
		System.out.println(name);
	}

}
