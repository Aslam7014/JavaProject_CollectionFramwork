package defaultingsorting;

class Student implements Comparable<Student> {
	int age;
	
	Student(int age){
		this.age=age;
		}
	
	public String toString() {
		return "Age is: " +age;
	}
	
	@Override
	public int compareTo(Student s) {
		return this.age - s.age;
	}

}
