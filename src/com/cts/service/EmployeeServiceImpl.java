package com.cts.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cts.dao.EmployeeDao;
import com.cts.main.HRM;
import com.cts.pojo.Employee;

public class EmployeeServiceImpl implements EmployeeDao {

	
	ArrayList<Employee> employeelist  = new ArrayList<Employee>();
	
	@Override
	public void addEmployee() {
		
		 	Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Id:");
	        int id = sc.nextInt();
	        System.out.println("Enter Name:");
	        String name = sc.next();
	        System.out.println("Enter the Job");
	        String job = sc.next();
	        System.out.println("Enter salary:");
	        Double salary = sc.nextDouble();
	        
	        Employee employee = new Employee();
	        
	        employee.setEid(id);
	        employee.setEname(name);
	        employee.setJob(job);
	        employee.setSalary(salary);
	        employeelist.add(employee);
	        
	        System.out.println("Employee added successfully....");
	}

	@Override
	public ArrayList<Employee> getAllEmployees() {
		
		return employeelist;
	}

	@Override
	public void updateEmployee(Employee employee) {
		
		employeelist.get(employee.getEid()).setEname(employee.getEname());
		
		System.out.println("Employee Id " + employee.getEid()  
		        + ", updated in the database");
		
	}

	@Override
	public void deleteEmployee(int id) {
		
		employeelist.remove(id);
		
		System.out.println("Employee Id " + id  
        + ", deleted from database");
		
	}
}



//
//@Override
//public Employee getEmployeeById(int eid) {
//	// TODO Auto-generated method stub
//	return employeelist.get(eid);
//}