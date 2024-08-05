package storingobjects;

import java.util.*;

class StudentMainClass {
	public static void main(String[] args) {

		Student s1 = new Student(22);
		Student s2 = new Student(23);

		ArrayList<Student> l = new ArrayList<Student> ();
		l.add(s1);
		l.add(s2);

		for(Student s : l) {
			System.out.println(s);

		}

	}
}
