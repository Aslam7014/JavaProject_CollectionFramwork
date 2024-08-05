package storingobjects;

import java.util.*;

class EmployeeMainClass {
	public static void main(String[] args) {
		
		Employee e1 =new Employee(7014,"Aslam");
		Employee e2 =new Employee(7015,"Zishan");
		Employee e3 =new Employee(7016,"Idrish");
		Employee e4 =new Employee(7017,"Rudra");
		
		LinkedList<Employee> ll = new LinkedList<Employee>();
		ll.add(e1);
		ll.add(e2);
		ll.add(e3);
		ll.add(e4);
				
		for(int i=0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}	
	}

}
