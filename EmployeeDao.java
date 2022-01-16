package com.ibcsPrimaxv2.EmployeeServices.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibcsPrimaxv2.EmployeeServices.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {
	

}
