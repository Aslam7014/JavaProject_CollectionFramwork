package com;

import java.util.*;
class MethodDemo {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(30);
		al.add(20);
		
		LinkedList ll = new LinkedList();
		ll.add(al);
		ll.add(55);
		
		System.out.println("LL: "+ll+" Size: "+ll.size());
	}

}
