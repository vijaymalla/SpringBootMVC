package com.luv2code.mymvcdemospringboot.dao;

import java.util.List;

import com.luv2code.mymvcdemospringboot.model.Employee;

public interface IEmployeeDao {
	
	public List<Employee> getAllEmployees();
	
	public Employee findById(int id);
	
	public void saveEmployee(Employee employee);
	
	public void deleteEmployee(int id);
	

}
