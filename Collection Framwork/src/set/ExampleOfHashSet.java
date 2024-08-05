package set;

import java.util.HashSet;

class ExampleOfHashSet {
	public static void main(String[] args) {

		HashSet<String> h = new HashSet<String>();   // can not maintain any order & suffled itself
		h.add("Aslam");
		h.add("Aslam1");
		h.add("Aslam2");
		h.add("Aslam3");
		h.add("Aslam4");
		h.add("Aslam5");

		for(Object d:h) {
			System.out.println(d);

		}

	}

}
