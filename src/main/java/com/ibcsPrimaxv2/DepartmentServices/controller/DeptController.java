package com.ibcsPrimaxv2.DepartmentServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ibcsPrimaxv2.DepartmentServices.entities.Department;
import com.ibcsPrimaxv2.DepartmentServices.services.DeptService;


@RestController
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
	
	
	
	
	@GetMapping("/deptHome")
	public String deptHome() {
		
		return "This is Department Controller home";
	}
	
	//Get Department
	
	@GetMapping("/department")
	public List<Department> getDepartments(){
		
		return this.deptService.getDepartments();
		
	}
	
	//Get one Department by id
	@GetMapping("/department/{departmentId}")
	public Department getDepartment(@PathVariable("departmentId") String departmentId) {
		
		
		return this.deptService.getDepartment(Long.parseLong(departmentId));
	}
	
	
	@PostMapping("/department")
	public Department addDepartment(@RequestBody Department department){
		
		return this.deptService.addDepartment(department);
	}

}


















