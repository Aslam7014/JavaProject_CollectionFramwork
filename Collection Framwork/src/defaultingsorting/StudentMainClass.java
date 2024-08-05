package defaultingsorting;
import java.util.*;

class StudentMainClass {
	public static void main(String[] args) {
		
		Student s1= new Student(22);
		Student s2=new Student(21);
		Student s3=new Student(24);
		
		TreeSet<Student> t = new TreeSet();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		for(Student s:t) {
			System.out.println(s);
		}	
	}
}
