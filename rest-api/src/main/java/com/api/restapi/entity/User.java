package com.api.restapi.entity;

public class User {
	
	private Long id;
	private String name;
	private String gender;
	private String dept;
	private double cgpa;
	private String placed;
	private String industry;
	private Integer salary;
	private String college;
	private String backlogs;
	
	public User(Long id, String name, String gender, String dept, double d, String placed, String industry,
			Integer salary, String college, String backlogs) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
		this.cgpa = d;
		this.placed = placed;
		this.industry = industry;
		this.salary = salary;
		this.college = college;
		this.backlogs = backlogs;
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
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(Float cgpa) {
		this.cgpa = cgpa;
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
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getBacklogs() {
		return backlogs;
	}
	public void setBacklogs(String backlogs) {
		this.backlogs = backlogs;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", dept=" + dept + ", cgpa=" + cgpa
				+ ", placed=" + placed + ", industry=" + industry + ", salary=" + salary + ", college=" + college
				+ ", backlogs=" + backlogs + "]";
	}
	
	
	
	

}
