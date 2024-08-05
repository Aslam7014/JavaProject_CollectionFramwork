package com;

import java.util.*;
class Runner {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(12);
		l.add(27);
		l.add(33);
		
		System.out.println(l);
		l.add(1, 55);
		System.out.println(l);
		l.add(2, 77);
		System.out.println();
		l.set(0, 1);
		System.out.println(l);
	}
	

}
