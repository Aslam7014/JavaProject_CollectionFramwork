package sortingexample;

class Car implements Comparable<Car>{
	int cost;
	
	Car(int cost){
		this.cost=cost;
	}
	
	public String toString() {
		return "COST :" +cost;
	}
	
	public int compareTo(Car c) {
		return c.cost - this.cost;
		
	}

}
