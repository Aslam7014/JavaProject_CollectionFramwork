package customsorting;

import java.util.TreeSet;

class StudentMainClass {
	public static void main(String[] args) {
		
		Student s1 = new Student(22,17.5);
		Student s2 = new Student(23, 11.0);
		Student s3 = new Student(21, 36.0);
		
		TreeSet<Student> t= new TreeSet();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		for(Student s:t) {
			System.out.println(s);
		}
	}

}
