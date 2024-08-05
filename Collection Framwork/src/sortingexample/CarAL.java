package sortingexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class CarAL {
	public static void main(String[] args) {
		Car c1=new Car(2000000);
		Car c2=new Car(2500000);
		Car c3=new Car(3000000);
		
		ArrayList<Car> al=new ArrayList<Car>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		Collections.sort(al);
		
		for(Car c:al) {
			System.out.println(c);
		}
		
		
	}

}
