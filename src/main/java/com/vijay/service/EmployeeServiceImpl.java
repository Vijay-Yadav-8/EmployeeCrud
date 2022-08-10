package com.vijay.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.dao.EmployeeDao;
import com.vijay.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;

	@Override
	public String addEmpoloyee(Employee employee) {
		dao.save(employee);
		return "Employee Added Successfully";
	}

	@Override
	public String updateEmployee(int id, Employee employee) {
		Optional<Employee> emp = dao.findById(id);
		if (emp.isPresent()) {
			return "Employee record does not exist";
		} else {
			dao.save(employee);
			return "Employee updated Successfully";
		}
	}

	@Override
	public Employee getEmployee(int id) {
		Optional<Employee> emp = dao.findById(id);
		return emp.get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return dao.findAll();
	}

	@Override
	public String deleteEmployee(int id) {
		dao.deleteById(id);
		return "Employee record deleted Successfully";
	}

}
