package com.springboot.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.example.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	
	public Optional<Employee> findByEname(String ename);
	
}
