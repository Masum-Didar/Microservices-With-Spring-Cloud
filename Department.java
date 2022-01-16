package com.ibcsPrimaxv2.DepartmentServices.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String Name;
	private Boolean Active;
	
	@Column
	@ElementCollection(targetClass=Employee.class)
	List<Employee> employee= new ArrayList<>();

	public Department(Long id, String name, Boolean active, List<Employee> employee) {
		super();
		Id = id;
		Name = name;
		Active = active;
		this.employee = employee;
	}
	
	

	public Department(Long id, String name, Boolean active) {
		super();
		Id = id;
		Name = name;
		Active = active;
	}



	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Boolean getActive() {
		return Active;
	}

	public void setActive(Boolean active) {
		Active = active;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [Id=" + Id + ", Name=" + Name + ", Active=" + Active + ", employee=" + employee + "]";
	}
	




}
