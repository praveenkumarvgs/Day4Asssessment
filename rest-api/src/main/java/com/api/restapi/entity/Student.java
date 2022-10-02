package com.api.restapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="studentname")
	private String name;
	private String gender;
	private String dept;
	private String college;
	private double cgpa;
	private String backlogs;
	private String placed;
	private String industry;
	private Integer salary;
	
	
	
	
	public Student() {
		super();
	}


	public Student(Long id, String name, String gender, String dept, String college, double cgpa, String backlogs,
			String placed, String industry, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
		this.college = college;
		this.cgpa = cgpa;
		this.backlogs = backlogs;
		this.placed = placed;
		this.industry = industry;
		this.salary = salary;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getDept() {
		return dept;
	}




	public void setDept(String dept) {
		this.dept = dept;
	}




	public String getCollege() {
		return college;
	}




	public void setCollege(String college) {
		this.college = college;
	}




	public double getCgpa() {
		return cgpa;
	}




	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}




	public String getBacklogs() {
		return backlogs;
	}




	public void setBacklogs(String backlogs) {
		this.backlogs = backlogs;
	}




	public String getPlaced() {
		return placed;
	}




	public void setPlaced(String placed) {
		this.placed = placed;
	}




	public String getIndustry() {
		return industry;
	}




	public void setIndustry(String industry) {
		this.industry = industry;
	}




	public Integer getSalary() {
		return salary;
	}




	public void setSalary(Integer salary) {
		this.salary = salary;
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", dept=" + dept + ", college=" + college
				+ ", cgpa=" + cgpa + ", backlogs=" + backlogs + ", placed=" + placed + ", industry=" + industry
				+ ", salary=" + salary + "]";
	}
			

}
