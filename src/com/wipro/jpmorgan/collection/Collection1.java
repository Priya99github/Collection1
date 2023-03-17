package com.wipro.jpmorgan.collection;

import java.util.ArrayList;

public class Collection1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(2, 40);
		list.add(50);
		list.add(60);	
		System.out.println(list);
	}

}
