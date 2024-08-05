package defaultingsorting;

class Person  implements Comparable<Person> {
	int age;
	String name;
	
	Person(int age, String name){
		this.age=age;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Person is "+name+" and his age is "+age;
	}
	
	@Override
	public int compareTo(Person p) {
	    return this.name.compareTo(p.name);
	}
}

/**
 * Sorting based on age (int):
 * i.Ascending order -> return this.age - p.age;
 * ii.descending order -> return p.age - this.age;
 * 
 * Sorting based on name (String):
 * i. i.Ascending order -> return this.name.comoateTo(p.name);
 * ii.descending order -> return p.name.compareTo(this.name);
 * 
 * Sorting based on salary (double): CHANGE DATATYPE PREMITIVE TO NON-PRIMITIV (Double)
 * i. i.Ascending order -> return this.salary.comoateTo(p.salary);
 * ii.descending order -> return p.salary.compareTo(this.salary);
 * 
 * Note: for String comparison we can not use (-),
 * we have to use compareTo() of String class. 
 */
 
