package com.ibcsPrimaxv2.EmployeeServices.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private Date dob;
	
	@Column(unique = true, length = 4)
	private int code;
	private String Gender;
	private int Mobile;
	
	private Long deptId;
	
	
	
	public Employee(long id, String name, Date dob, int code, String gender, int mobile, Long deptId) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.code = code;
		Gender = gender;
		Mobile = mobile;
		this.deptId = deptId;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	

	public int getMobile() {
		return Mobile;
	}


	public void setMobile(int mobile) {
		Mobile = mobile;
	}


	public Long getDeptId() {
		return deptId;
	}


	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", code=" + code + ", Gender=" + Gender
				+ ", Mobile=" + Mobile + ", deptId=" + deptId + "]";
	}


	public void setDepartment(List department) {
		// TODO Auto-generated method stub
		
	}


	


	

	

}
