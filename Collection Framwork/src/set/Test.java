package set;

import java.util.TreeSet;

class Test {
	public static void main(String[] args) {
		
		TreeSet<String> t = new TreeSet();
		t.add("App1");
		t.add("App2");
		t.add("App3");
		t.add("Appx");
		t.add("AppZ");
		
		for(String i: t) {
			System.out.println(i);
		}		
	}
}
