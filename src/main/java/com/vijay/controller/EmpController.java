package com.vijay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vijay.entity.Employee;
import com.vijay.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmpController {

	@Autowired
	EmployeeService service;
	@PostMapping("/add")
	public String addEmployee(@RequestBody Employee employee) {
		return service.addEmpoloyee(employee);
	}
	@PutMapping("/update/{id}")
	public String updateEmployee(@RequestBody Employee employee,@PathVariable int id) {
		return service.updateEmployee(id, employee);
	}
	@GetMapping("/get/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return service.getEmployee(id);
	}
	@GetMapping("getAll")
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return service.deleteEmployee(id);
	}
	
	
	
}
