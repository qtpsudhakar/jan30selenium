package com.java.basics;

import java.util.HashSet;

public class C14Set {

	public static void main(String[] args) {
		// List can store duplicate data
		// set cannot store duplicate data
		// it will store only unique data

		HashSet st = new HashSet();
		st.add(10);
		st.add(10);
		st.add(20);
		st.add("web");
		st.add("web");
		st.add("web");
		st.add("selenium");

		System.out.println(st.size());

		for (Object obj : st) {

			System.out.println(obj);
		}

		// print values from set using an index number
		Object xyz[] = st.toArray();
		for (int i = 0; i < xyz.length; i++) {
			System.out.println(xyz[i]);
		}
	}

}
