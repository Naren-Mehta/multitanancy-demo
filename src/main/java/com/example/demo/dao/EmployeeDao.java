package com.example.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void createEmployee(Employee emp) {
		
		Session session =null;
		
		try {
			session=sessionFactory.openSession();
			session.beginTransaction();
			Integer id= (Integer) session.save(emp);
			System.out.println("Employee is created with id "+id);
			session.getTransaction();
		
		}catch (Exception e) {
		}
		
	}

}
