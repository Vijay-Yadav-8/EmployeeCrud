package com.vijay.service;

import java.util.List;

import com.vijay.entity.Employee;

public interface EmployeeService {
	public String addEmpoloyee(Employee employee);

	public String updateEmployee(int id,Employee employee);

	public Employee getEmployee(int id);

	public List<Employee> getAllEmployees();

	public String deleteEmployee(int id);

}
