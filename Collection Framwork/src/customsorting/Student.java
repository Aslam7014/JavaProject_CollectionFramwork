package customsorting;

class Student {
	int age;
	double marks;
	
	Student(int age, double marks){
		this.age=age;
		this.marks=marks;
		}
	
	public String toString() {
		return "age: "+age+" & marks is "+marks;
	}

}
