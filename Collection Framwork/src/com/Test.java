package com;

import java.util.ArrayList;
class Test {
	public static void main(String[] args) {
		
		//internally an array get created based on
		//default initial capacity (10)
		ArrayList a = new ArrayList();
		
		ArrayList b = new ArrayList(20);
		
		
		ArrayList x = new ArrayList();
		x.add(10);
		x.add(20);
		
		ArrayList y = new ArrayList(x);
		y.add(30);
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
	}

}
