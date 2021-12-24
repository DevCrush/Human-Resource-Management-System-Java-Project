package com.cts.main;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

import com.cts.pojo.Department;
import com.cts.pojo.Employee;
import com.cts.service.DepartmentServiceImpl;
import com.cts.service.EmployeeServiceImpl;

class MainMenu
{
	public void welcome() {
		System.out.println("\t\t*******************************************");
		System.out.println("\t\t\t************WELCOME************************");
		System.out.println("\t\t\t**************TO***************************");
	    System.out.println("\t\t\t  HUMAN RESOURCE MANAGEMENT SYSTEM");
	    System.out.println("\t\t*********************************************");
	}
  public void menu()
  {
    
    System.out.println("\n\nPress 1 : To Add an Employee Details");
    System.out.println("Press 2 : To get all Employee Details ");
    System.out.println("Press 3 : To Remove an Employee");
    System.out.println("Press 4 : To Update Employee Details");
    System.out.println("\nPress 5 : To Add an Department Details");
    System.out.println("Press 6 : To get all Department Details ");
    System.out.println("Press 7 : To Remove an Department");
    System.out.println("Press 8 : To Update Department Details");
    System.out.println("Press 9 : To Exit the HRMS Portal");

  }
  public void out()
  {
    System.out.println("\n\n*****************************************");
    System.out.println(" Thank You For Using our Software!!) ");
    System.out.println("*****************************************");
    System.out.println("\t\t***Developed By****\n\n"
    		+ "\n\t\tMd Saddam Khan\n\t\tUI Designer and Web Developer");
    System.exit(0);
  }
}

public class HRM {

	static EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
	static DepartmentServiceImpl departmentServiceImpl  = new DepartmentServiceImpl();
	
	public static void displayEmployee() {
		for(Employee employee : employeeServiceImpl.getAllEmployees()) {
			System.out.println("Employee's Id: " + employee.getEid() + "\n" +
								"Employee's Name: " + employee.getEname() + "\n" +
								"Employee's Job: " + employee.getJob() + "\n" + 
								"Employee's Salary: " + employee.getSalary());
			System.out.println();
		}
	}
	
	public static void displayDepartment() {
		for(Department department: departmentServiceImpl.getAllDepartment()) {
			System.out.println("Department's Id: " + department.getDid() + "\n" +
								"Department's Name: " + department.getDname() + "\n" +
								"Location: " + department.getLocation() + "\n");
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		FileReader fileReader = new FileReader("src/db.properties");
		Properties properties = new Properties();
		properties.load(fileReader);
		

	
		ArrayList<Employee> employee = new ArrayList<Employee>();
		Employee employee2 = new Employee();
		Department department = new Department();
		
		MainMenu mainMenu = new MainMenu();
		mainMenu.welcome();

		

		while(true) {
			System.out.println("Enter username:");
			String user = sc.next();
			System.out.println("Enter password: ");
			String pass = sc.next();
			if(properties.getProperty("user").equals(user) &&
				properties.getProperty("password").equals(pass)) {
				System.out.println("Login success");
		
				mainMenu.menu();
		
		
				int i = 0;
		
				while(i < 10) {
			

				     System.out.print("\nPlease Enter choice :");
				     i=Integer.parseInt(sc.next());
				
				     switch(i) {
					
					     case 1:
					     {
					    	 employeeServiceImpl.addEmployee();
					    	 break;
					     }
					     case 2:
					     {
					    	 HRM.displayEmployee();
					    	 break;
					     }
					     case 3:
					     {
							System.out.println("Enter Employee Id to deleted.");
							int id = sc.nextInt();
							employeeServiceImpl.deleteEmployee(id);
							break;
					     }
					     case 4:
					     {
					    	System.out.println("Enter Employee Id to update");
					    	int id = sc.nextInt();
					    	employee2.setEid(id);
					    	System.out.println("Enter Employee name to update.");
							String name = sc.next();
							employee2.setEname(name);
							employeeServiceImpl.updateEmployee(employee2);
							break;
					    	 
					     }
					     case 5:
					     {
					    	 departmentServiceImpl.addDeprtment();
					    	 break;
					     }
					     case 6:
					     {
					    	 HRM.displayDepartment();
					    	 break;
					     }
					     case 7:
					     {
							System.out.println("Enter Department Id to deleted.");
							int id = sc.nextInt();
							departmentServiceImpl.deleteDepartment(id);
							break;
					     }
					     case 8:
					     {
					    	System.out.println("Enter Department Id to update");
					    	int id = sc.nextInt();
					    	department.setDid(id);
							System.out.println("Enter Department name to update.");
							String name = sc.next();
							department.setDname(name);
							departmentServiceImpl.updateDepartment(department);
							break;
					     }
					     case 9:
					     {
					    	 
					    	 mainMenu.out();
					     }
			    }
			}   
		}
		else {
			System.out.println("Login Failure.Try Again");
			System.out.println();
		}
		}

	}

}







//case 3:
//{
//	System.out.println("Enter Employee Id:");
//	int id = sc.nextInt();
//	employeeServiceImpl.getEmployeeById(id);
//	System.out.println("Employee's Id: " + employee2.getEid() + "\n" +
//			"Employee's Name: " + employee2.getEname() + "\n" +
//			"Employee's Job: " + employee2.getJob() + "\n" + 
//			"Employee's Salary: " + employee2.getSalary());
//}
