package com.ibcsPrimaxv2.EmployeeServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ibcsPrimaxv2.EmployeeServices.entities.Employee;
import com.ibcsPrimaxv2.EmployeeServices.services.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/empHome")
	public String empHome() {
		return "This is Employee comtroller home page";
	}
	
	//Get Employee 
	
	@GetMapping("/employee")
	public List<Employee> getEmployees(){
		
		return this.empService.getEmployees();
		
	}
	
	//Get one Employee by id
	@GetMapping("/employee/{employeeId}")
	public Employee getEmployee(@PathVariable String employeeId) {
		
		Employee employee =this.empService.getEmployee(Long.parseLong(employeeId));
		
		List department = this.restTemplate.getForObject("http://localhost:9002/department/employee" +employee.getDeptId(), List.class);
		
		employee.setDepartment(department);
		
		return employee;
		
	}
	
	//Post Mapping
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		
		return this.empService.addEmployee(employee);
		
	}
	
	//Updating using PUT Request
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		
		return this.empService.updateEmployee(employee);
		
	}
	
	
	//Delete the Employee by employeeId
	@DeleteMapping("/employee/{employeeId}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable String employeeId){
		
		try {
			this.empService.deleteEmployee(Long.parseLong(employeeId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	

}





