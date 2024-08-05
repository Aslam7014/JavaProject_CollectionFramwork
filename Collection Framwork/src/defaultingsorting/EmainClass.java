package defaultingsorting;

import java.util.TreeSet;

class EmainClass {
	public static void main(String[] args) {
		 
		Employee e1 = new Employee(7014,"aslam",3.5);
		Employee e2 = new Employee(7015,"cslam",3.9);
		Employee e3 = new Employee(7016,"bslam",3.7);
		
		TreeSet<Employee> t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		
		for(Object o:t) {
			System.out.println(o);
		}
	}

}
