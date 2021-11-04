package com.caseStudy;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> Emplist;
		List<Department> Deptlist;
		EmployeeRepository er = new EmployeeRepository();
		EmployeeService es = new EmployeeService();
	    System.out.println(er.getEmployeeList());
	    System.out.println(er.getDepartmentList());
	    System.out.println(es.findSalarySum());
	   
	    System.out.println(es.employeeWithoutDept());
	    System.out.println(es.DeptwithoutEmp());
	    
		
		
				
	}

}
