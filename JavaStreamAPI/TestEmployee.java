package in.co.JavaStreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		
		List <Employee> list = new ArrayList<>();
		list.add(new Employee("Vishal", 9));
		list.add(new Employee("Chetan", 8));
		list.add(new Employee("Vl", 7));
		list.add(new Employee("Vhal", 6));
		list.add(new Employee("Val", 5));
		
		// for find max remove skip method below
		
		
		double SecondHighestSalary = list.stream().map(e -> e.getSalary())
				.distinct().sorted(Comparator.reverseOrder())
				.skip(1).findFirst().orElse(0.0);
		System.out.println("Second Largest salary is "+SecondHighestSalary);
		
	}
}
