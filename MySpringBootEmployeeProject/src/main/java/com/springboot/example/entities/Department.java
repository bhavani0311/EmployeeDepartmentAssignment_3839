package com.springboot.example.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="department_table")
public class Department {
	
		@Id
		@Column(name="departmentId")
		private Long id;
		
		@Column(name="departmentName")
		private String name;
		
		public Department() {
			
		}

		public Department(Long id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Department [id=" + id + ", name=" + name + "]";
		}
		
		
		

}
