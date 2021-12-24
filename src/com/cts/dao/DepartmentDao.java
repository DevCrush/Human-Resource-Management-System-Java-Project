package com.cts.dao;

import java.util.ArrayList;
import java.util.List;

import com.cts.pojo.Department;

public interface DepartmentDao {
	
	public void addDeprtment();
	public ArrayList<Department> getAllDepartment();
//	public Department getDepartmentById(int did);
	public void updateDepartment(Department department);
	public void deleteDepartment(int id);
}
