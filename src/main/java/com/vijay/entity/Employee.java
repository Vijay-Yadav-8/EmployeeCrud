package com.vijay.entity;

import java.sql.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String fullName;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-mm-dd")
	private Date joiningDate;
	private float salary;

	public Employee() {
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Employee(int empId, String fullName, Date joiningDate, float salary) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.joiningDate = joiningDate;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fullName=" + fullName + ", joiningDate=" + joiningDate + ", salary="
				+ salary + "]";
	}
	
}
