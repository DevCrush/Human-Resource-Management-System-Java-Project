package com.cts.pojo;

public class Employee {
	
	private int eid;
	private String ename;
	private String job;
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(int eid, String ename, String job, double salary) {
		
		super();
		this.eid = eid;
		this.ename = ename;
		this.job = job;
		this.salary = salary;
	}

	public int getEid() {
		
		return eid;
	}

	public void setEid(int eid) {
		
		this.eid = eid;
	}

	public String getEname() {
		
		return ename;
	}

	public void setEname(String ename) {
		
		this.ename = ename;
	}

	public String getJob() {
		
		return job;
	}

	public void setJob(String job) {
		
		this.job = job;
	}

	public double getSalary() {
		
		return salary;
	}

	public void setSalary(double salary) {
		
		this.salary = salary;
	}

	@Override
	public String toString() {
		
		return "Employee [eid=" + eid + ", ename=" + ename + ", job=" + job + ", salary=" + salary + "]";
	}
}


