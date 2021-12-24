package com.cts.dao;

import java.util.ArrayList;
import java.util.List;

import com.cts.pojo.Employee;

public interface EmployeeDao {
	
	public void addEmployee();
	public ArrayList<Employee> getAllEmployees();
//	public Employee getEmployeeById(int eid);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(int id);
}
