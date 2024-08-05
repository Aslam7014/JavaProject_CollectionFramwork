package com;

import java.util.*;
class Example {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		
		LinkedList ll = new LinkedList();
		ll.add(al);
		ll.add(30);
		
		System.out.println(ll.contains(al));
		System.out.println(ll);
		ll.remove(al);
		System.out.println(ll.containsAll(al));
		
	}

}
