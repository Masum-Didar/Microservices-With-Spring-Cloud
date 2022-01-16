package com.ibcsPrimaxv2.EmployeeServices.services;

import java.util.List;

import com.ibcsPrimaxv2.EmployeeServices.entities.Employee;

public interface EmpService {
	
	public List<Employee> getEmployees();
	
	public Employee getEmployee(long employeeId);
	
	public Employee addEmployee (Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(long parseLong);

	
	

}
