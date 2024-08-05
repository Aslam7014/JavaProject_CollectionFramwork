package sortingexample;

class Pen implements Comparable<Pen>{
	int cost;
	
	Pen(int cost){
		this.cost=cost;
	}
	
	public String toString() {
		return "COST :"+cost;
	}
	
	public int compareTo(Pen p) {
		return this.cost - p.cost;
	}

}
