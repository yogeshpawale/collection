package com.practical.arraylist;

import java.util.ArrayList;

public class DemoArrayList2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(50);
		al.add(25);
		al.add(null);
		al.add(1000);
		al.add(125);
		al.add(null);
		al.add(50);
		al.add(25);
		al.remove(4);
		al.add(125);
		System.out.println(al);

	}

}
