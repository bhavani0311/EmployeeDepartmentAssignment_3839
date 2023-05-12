package com.springboot.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.example.entities.Employee;
import com.springboot.example.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee emp) {
		return empService.saveEmployee(emp);
	}
	
	@GetMapping("/findEmployeeById/{id}")
	public Optional<Employee> findEmployeeById(@PathVariable("id") Long eid) {
		return empService.findEmployeeById(eid);
	}
	
	@GetMapping("/findEmployeeByName/{name}")
	public Optional<Employee> findEmployeeByName(@PathVariable("name") String ename){
		return empService.findEmployeeByName(ename);
	}
	
	@DeleteMapping("/deleteEmployee")
	public void deleteEmployee() {
		empService.deleteEmployee();
	}
	//My method for enhacement
	//we can save not one employee but a list of employees
	@PostMapping("/saveEmployees")
	public List<Employee> saveEmployees(@RequestBody List<Employee> emps) {
		return empService.saveEmployees(emps);
	}
	
	@PutMapping("/updateEmployeeById/{id}")
	public Employee updateEmployeeById(@RequestBody Employee emp,
			@PathVariable("id") Long eid) {
		return empService.updateEmployeeById(emp, eid);
	}
}
