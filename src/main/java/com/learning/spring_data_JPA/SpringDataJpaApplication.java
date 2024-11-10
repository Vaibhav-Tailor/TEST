package com.learning.spring_data_JPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.learning.spring_data_JPA.model.Employee;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringDataJpaApplication.class, args);
		
		EmployeeRepo repo=context.getBean(EmployeeRepo.class);
		
		Employee e1=context.getBean(Employee.class);
		Employee e2=context.getBean(Employee.class);
		Employee e3=context.getBean(Employee.class);
		
		e1.setId(1);
		e1.setName("Vaibhav");
		e1.setSalary(25000);
	

		e2.setId(2);
		e2.setName("Samarth");
		e2.setSalary(50000);

		e3.setId(3);
		e3.setName("Poonam");
		e3.setSalary(80000);
	
		repo.save(e1);
	}

}
