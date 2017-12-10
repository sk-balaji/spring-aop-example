package org.aopexample.service;

import java.util.ArrayList;

import org.aopexample.pojo.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public EmployeeService() {
	
	}

	public void addEmployee(Employee emp) {		
		employees.add(emp);
	}
	
	
	public void listEmployee() {
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
	}
	
}
