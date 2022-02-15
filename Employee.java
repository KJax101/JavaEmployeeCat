package Q7EmplyeeSort;

public class Employee {
	String name;
	String department;
	int age;

	public Employee(String name, String department, int age) {
		this.name = name;
		this.department = department;
		this.age = age;
	}
	
	public int compareTo(Employee emp) {
		return this.name.compareTo(emp.name);
	}
	

}
