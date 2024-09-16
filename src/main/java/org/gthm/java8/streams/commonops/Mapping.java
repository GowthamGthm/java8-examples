package org.gthm.java8.streams.commonops;
import java.util.List;
import java.util.stream.Stream;

import org.gthm.java8.domain.Employee;
import org.gthm.java8.util.EmployeeUtil;


//Mapping operation
public class Mapping {
	List<Employee> employees = EmployeeUtil.createEmployees();
	
	private void testMapping() {
		Stream<String> empStream = employees
				.stream()
				.map(Employee::getName)
				.map(String::toUpperCase);
		
		empStream.forEach(System.out::println);
	}
	public static void main(String[] args) {
		new Mapping().testMapping();
	}

}
