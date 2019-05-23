package com.luv2code.mymvcdemospringboot.service;

import java.util.List;

import com.luv2code.mymvcdemospringboot.model.Employee;

public interface IEmployeeService {
	
	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void save(Employee employee);
	
	public void deleteById(int id);

}
