package org.aopexample.test;

import org.aopexample.pojo.Employee;
import org.aopexample.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProject {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appcontext.xml");
		
		EmployeeService empService = (EmployeeService)appContext.getBean(EmployeeService.class);
		
		empService.addEmployee(new Employee(1,"Balaji"));
		empService.addEmployee(new Employee(2,"Ravi"));
		empService.addEmployee(new Employee(3,"Prajith"));
		
		empService.listEmployee();
	}

}
