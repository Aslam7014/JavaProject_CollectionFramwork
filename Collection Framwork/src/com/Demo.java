package com;
import java.util.ArrayList;

class Demo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add("aslam"); 
		l.add("null");
		l.add(23.2);
		l.add(10);
		
		System.out.println(l);
		System.out.println(l.get(1));
		System.out.println(l.size());
		System.out.println(l.contains("java"));
		System.out.println(l.contains("aslam"));
		
	}

}
