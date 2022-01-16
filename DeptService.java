package com.ibcsPrimaxv2.DepartmentServices.services;

import java.util.List;

import com.ibcsPrimaxv2.DepartmentServices.entities.Department;

public interface DeptService {
	
	public List<Department> getDepartments();
	
	public Department getDepartment(long departmentId);
	
	public Department addDepartment(Department department);

	Department updateDepartment(Department department);

	void deleteDepartment(long parseLong);


}
