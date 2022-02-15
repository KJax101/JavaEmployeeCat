package Q7EmplyeeSort;

import java.util.Collections;
import java.util.Comparator;

public class Main implements Comparator<Employee>{
	public static void main(String[] args) {
		Employee john = new Employee("John", "IT", 20);
		Employee jeff = new Employee("Jeff", "HR", 55);

		
		
		if(john.name.compareTo(jeff.name) == 1 ) {
			
		}
		
		
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
