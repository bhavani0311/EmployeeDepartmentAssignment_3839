package com.springboot.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.example.entities.Employee;
import com.springboot.example.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;
	
	@Override
	public Employee saveEmployee(Employee emp) {
		Employee e = empRepo.save(emp);
		return e;
	}
	
	public Optional<Employee> findEmployeeById(Long eid){
		Optional<Employee> e;
		e = empRepo.findById(eid);
		return e;
	}

	@Override
	public Optional<Employee> findEmployeeByName(String ename) {
		Optional<Employee> e;
		e=empRepo.findByEname(ename);
		return e;
	}
	
	@Override
	public void deleteEmployee() {
		empRepo.deleteAll();
	}

	@Override
	public List<Employee> saveEmployees(List<Employee> emps) {
		return empRepo.saveAll(emps);
	}
	
	@Override
	public Employee updateEmployeeById(Employee e,Long eid) {

		Employee emp = 
				empRepo.findById(eid).get();
		emp.setEname(e.getEname());
		emp.setDepartment(e.getDepartment());
		return empRepo.save(emp);
	}
	
	
}
