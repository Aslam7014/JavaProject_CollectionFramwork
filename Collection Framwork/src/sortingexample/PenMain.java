package sortingexample;

import java.util.TreeSet;

class PenMain {
	public static void main(String[] args) {
		Pen p1=new Pen(20);
		Pen p2=new Pen(25);
		Pen p3=new Pen(30);
		
		
		TreeSet<Pen> t=new TreeSet<Pen>();
		t.add(p1);
		t.add(p2);
		t.add(p3);
		
		for(Pen p:t) {
			System.out.println(p);
		}
		
		
	}

}
