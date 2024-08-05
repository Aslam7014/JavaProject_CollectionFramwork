package defaultingsorting;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	Double salary;
	
	Employee(int id, String name, double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	 }
	
	public String toString() {
		return "id :"+id+", name :"+name+ ", salary:"+salary+"LPA";
	}
	
	public int compareTo(Employee e) {
		return  e.salary.compareTo(this.salary);
	}
}