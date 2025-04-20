package com.springaop;

import com.springaop.model.Employee;
import com.springaop.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAopApplication {

	public static void main(String[] args) {

		//SpringApplication.run(SpringAopApplication.class, args);
		ApplicationContext applicationContext =  SpringApplication.run(SpringAopApplication.class, args);
		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
		employeeService.addEmployee(new Employee(100L, "raju", "kumar", "ramesh@gmail.com"));
		employeeService.getEmployeeById(100L);
		employeeService.getAllEmployees();
	}

}
