package com.ibcsPrimaxv2.DepartmentServices.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibcsPrimaxv2.DepartmentServices.entities.Department;

public interface DepartmentDao extends JpaRepository<Department, Long> {

	

}
