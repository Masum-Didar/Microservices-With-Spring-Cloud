package com.ibcsPrimaxv2.DepartmentServices.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibcsPrimaxv2.DepartmentServices.dao.DepartmentDao;
import com.ibcsPrimaxv2.DepartmentServices.entities.Department;


@Service
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DepartmentDao departmnetDao;
	
//	List<Department> list;
	

	public DeptServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Department());
		// TODO Auto-generated constructor stub
	}


	@Override
	public List<Department> getDepartments() {
		// TODO Auto-generated method stub
		return departmnetDao.findAll();
	}


	@Override
	public Department getDepartment(long departmentId) {
		
//		Department d=null;
//		
//		for(Department department: list) {
//			if(department.getId()==departmentId)
//			{
//				d=department;
//				break;
//			}
//		}
//		// TODO Auto-generated method stub
		return departmnetDao.getOne(departmentId);
	}


	@Override
	public Department addDepartment(Department department) {
		
//		list.add(department);
		departmnetDao.save(department);
		return department;
	}
	
	@Override
	public Department updateDepartment(Department department) {
		
		
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
		
		departmnetDao.save(department);
		return department;
	}


	@Override
	public void deleteDepartment(long parseLong) {
		
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Department entity = departmnetDao.getOne(parseLong);
		departmnetDao.delete(entity);
	
	}

}
