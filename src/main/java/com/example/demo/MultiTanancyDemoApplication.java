package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;

@SpringBootApplication
public class MultiTanancyDemoApplication implements CommandLineRunner {

	@Autowired
	private EmployeeDao employeeDao;
	
	public static void main(String[] args) {
		SpringApplication.run(MultiTanancyDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee emp = getEmployee();
		employeeDao.createEmployee(emp);
	}
	
	private Employee getEmployee() {
		Employee emp = new Employee();
		emp.setName("Naren");
		emp.setDoj(new Date());
		emp.setSalary(50000.00);
		return emp;
	}

}
