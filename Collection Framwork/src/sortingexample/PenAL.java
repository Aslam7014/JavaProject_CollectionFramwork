package sortingexample;

import java.util.ArrayList;

class PenAL {
	public static void main(String[] args) {
		Pen p1=new Pen(20);
		Pen p2=new Pen(25);
		Pen p3=new Pen(30);
		
		
		ArrayList<Pen> al=new ArrayList<Pen>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		
		for(Pen p:al) {
			System.out.println(p);
		}
		
		
	}

}



