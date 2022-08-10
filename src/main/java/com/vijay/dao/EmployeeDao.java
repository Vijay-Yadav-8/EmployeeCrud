package com.vijay.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
