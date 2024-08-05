package set;

import java.util.TreeSet;

class ExampleOfTreeSet {
	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet<Integer>(); // maintain default sorting using tree algorithm
		t.add(50);
		t.add(20);
		t.add(10);
		t.add(23);
		t.add(90);
		t.add(21);
		
		for(int i:t) {
			System.out.println(i);			
		}
		
		System.out.println(t.size());
		
	}
	

}
