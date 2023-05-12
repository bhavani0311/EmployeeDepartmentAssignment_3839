package com.springboot.example.service;

import java.util.List;
import java.util.Optional;

import com.springboot.example.entities.Employee;

public interface EmployeeService {
	
    public Employee saveEmployee(Employee emp);
	
	public Optional<Employee> findEmployeeById(Long eid);
	
	public Optional<Employee> findEmployeeByName(String ename);
	
	public void deleteEmployee();
	
	public List<Employee> saveEmployees(List<Employee> emps);

	public Employee updateEmployeeById(Employee emp,Long eid);
}
