package com.springboot.example.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_table")
public class Employee {
	
	@Id
	@GeneratedValue
	@Column(name= "eid")
	private Long eid;
	
	@Column(name= "ename")
	private String ename;
	
	@Column(name= "erole")
	private String role;
	
	@Column(name= "eaddress")
	private String address;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="departmentId",referencedColumnName="departmentId")
	private Department department;
	
	public Employee(){
	}

	public Employee(Long eid, String ename, String role, String address, Department department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.role = role;
		this.address = address;
		this.department = department;
	}

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", role=" + role + ", address=" + address + ", department="
				+ department + "]";
	}

	
	
	
}
