package com.cts.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cts.dao.DepartmentDao;
import com.cts.pojo.Department;
import com.cts.pojo.Employee;

public class DepartmentServiceImpl implements DepartmentDao{
	
	
	ArrayList<Department> departmentlist = new ArrayList<Department>();

	@Override
	public void addDeprtment() {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Department Id:");
        int id = sc.nextInt();
        System.out.println("Enter Department Name:");
        String name = sc.next();
        System.out.println("Enter the location");
        String location = sc.next();
       
        Department department = new Department();
        department.setDid(id);
        department.setDname(name);
        department.setLocation(location);
      
        departmentlist.add(department);
        
        System.out.println("Department added successfully....");
		
		
	}

	@Override
	public ArrayList<Department> getAllDepartment() {
		
		return departmentlist;
	}

//	@Override
//	public Department getDepartmentById(int did) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public void updateDepartment(Department department) {
		
		departmentlist.get(department.getDid()).setDname(department.getDname());
		
		System.out.println("Department Id " + department.getDid()  
		        + ", updated in the database");
		
	}

	@Override
	public void deleteDepartment(int id) {
		
		departmentlist.remove(id);
		
		System.out.println("Department Id " + id  
        + ", deleted from database");
		
	}
}
