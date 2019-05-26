package com.luv2code.mymvcdemospringboot.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.luv2code.mymvcdemospringboot.model.Employee;

public class EmployeeDao implements IEmployeeDao {
	
	private EntityManager entityManager;
	
	//Constructor Injection
	@Autowired
	public EmployeeDao(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub

	}

}
