package com.caseStudy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	List<Employee> Emplist=new ArrayList<>(); 
	List<Department> Deptlist = new ArrayList<>();
	Department d1 = new Department(0, "cloud", 123);
	Department d2 = new Department(01, "cloudDigital", 123);
	
	public List<Employee> getEmployeeList(){
		
		
		Employee e1 = new Employee(1, "naman", "mishra", "naman@gmail", "7054", LocalDate.of(2021, 11, 01), "Associate", 20000, 123, d1);
		Employee e2 = new Employee(2, "mayank", "awasthi", "mayank@gmail", "9935", LocalDate.of(2021, 11, 01), "Associate", 20000, 123, d2);
		Employee e3 = new Employee(3, "samad", "zaheer", "samad@gmail", "705423", LocalDate.of(2021, 11, 01), "Associate", 20000, 123, d1);
		Employee e4 = new Employee(4, "manu", "tomar", "manu@gmail", "8052", LocalDate.of(2021, 11, 01), "Associate", 20000, 123, d2);
		Employee e5 = new Employee(5, "fahad", "siddique", "fahad@gmail", "8795", LocalDate.of(2021, 11, 01), "Associate", 20000, 123, d1);
		Emplist.add(e1);
		Emplist.add(e2);
		Emplist.add(e3);
		Emplist.add(e4);
		Emplist.add(e5);
		return Emplist;
		
		
	}
	public List<Department> getDepartmentList(){
		
		Deptlist.add(d2);
		Deptlist.add(d1);
		return Deptlist;
		
	}
	

}
