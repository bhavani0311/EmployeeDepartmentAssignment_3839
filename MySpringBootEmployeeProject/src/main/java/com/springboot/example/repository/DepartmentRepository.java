package com.springboot.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.example.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{

}
