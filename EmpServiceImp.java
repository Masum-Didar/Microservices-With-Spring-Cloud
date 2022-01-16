package com.ibcsPrimaxv2.EmployeeServices.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibcsPrimaxv2.EmployeeServices.dao.EmployeeDao;
import com.ibcsPrimaxv2.EmployeeServices.entities.Employee;


@Service
public class EmpServiceImp implements EmpService {
	
	@Autowired
	private EmployeeDao employeeDao;

	
//	List<Employee> list;
	
	
	public EmpServiceImp() {
//		list = new ArrayList<>();
//		list.add(new Employee());

	}


	@Override
	public List<Employee> getEmployees() {
		
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}


	@Override
	public Employee getEmployee(long employeeId) {
		
//		Employee e = null;
//		
//		for(Employee employee: list) {
//			if(employee.getId() == employeeId) {
//				e = employee;
//				break;
//			}
//		}
		
		// TODO Auto-generated method stub
		return employeeDao.getOne(employeeId);
	}


	@Override
	public Employee addEmployee(Employee employee) {
		
//		list.add(employee);
		// TODO Auto-generated method stub
		
		employeeDao.save(employee);
		return employee;
	}


	@Override
	public Employee updateEmployee(Employee employee) {
		
		
//		list.forEach(e -> {
//			
//			if(e.getId() == employee.getId()) {
//				
//				e.setName(employee.getName());
//				e.setCode(employee.getCode());
//				e.setGender(employee.getGender());
//				e.setMobile(employee.getMobile());
//				e.setDob(employee.getDob());
//				
//			}
//			
//		});
		
		employeeDao.save(employee);
		return employee;
	}


	@Override
	public void deleteEmployee(long parseLong) {
		
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Employee entity = employeeDao.getOne(parseLong);
		employeeDao.delete(entity);
	
	}

	

}









