package defaultingsorting;

import java.util.TreeSet;

class PersonStringClass {
	public static void main(String[] args) {
		
		Person p1= new Person(22,"aslam");
		Person p2= new Person(23,"dslam");
		Person p3= new Person(24,"cslam");
		Person p4= new Person(25,"bslam");
		
		TreeSet<Person> t = new TreeSet();
		t.add(p1);
		t.add(p2);
		t.add(p3);
		t.add(p4);
		
		for(Person p: t) {
			System.out.println(p);
		}
		
	}

}
