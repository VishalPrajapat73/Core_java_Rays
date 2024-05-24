package in.co.Collections;

public class Employee {
	int id;
	String name;
	double salary;
	
	
	public Employee(int id, String name, double salary ) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof Employee)) {
			return false;
		}
		Employee e = (Employee)obj;
		boolean b = this.id ==e.id && this.name == e.name&&this.salary == e.salary;
		return b;
		
	}

	@Override
	public int hashCode() {
			String str = id+name+salary;
			return str.hashCode();
		}


	@Override
	public String toString() {
		return "Employee [id="+id+",name="+name+", salary = "+salary+"]";
		
	}
	
	
	
		
	
}
