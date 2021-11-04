package com.caseStudy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeService  {
	List<Employee> Emplist=new ArrayList<>(); 
	List<Department> Deptlist = new ArrayList<>();
	Department dept = new Department();
	
	
	//1
	public double findSalarySum() {
		double sum=0;
		for(Employee emp:Emplist) {
			sum = sum +emp.getSalary();
			
		}
		return sum;
		
}
	
	
	
	//9
	public List<Employee> didntReport() {
		List<Employee> list = new ArrayList<>();
		for(Employee l : Emplist) {
			if(l.getManagerId()==0) {
				list.add(l);
			}
			
		}
		return list;

	}
	
	public List<Employee> sortEmpId(){
		
		List <Employee> list = Emplist.stream().sorted(Comparator.comparing(Employee::getEmployeeId)).collect(Collectors.toList());
		
		return list;
		
	}
	
	
	public List<Employee> sortByNameEmployee(){
        List<Employee>list= Emplist.stream().sorted(Comparator.comparing(Employee::getFirstName)).collect(Collectors.toList());
        return list;
	

}
	public  List<Employee> employeeWithoutDept(){
		List<Employee> list = new ArrayList<>();
		
		for(Employee emp : Emplist) {
			
			if(emp.getDepartment().equals(dept.getDepartmentId()==0)){
			list.add(emp);
			}
		}
		
		
		return list;
		
		
	}
	
	public List<Department> DeptwithoutEmp(){
		List<Department> list = new ArrayList<>();
		for(Department dept: Deptlist)
			if(dept.getEmployeeId()==0) {
				list.add(dept);
	}
		
		return list;
		
	}
	
	
	public void sortByDepartment() {
		 Emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment));
	}
	
	public Optional<Employee> seniorEmp() {
	 Optional<Employee> emp = Emplist.stream().sorted(Comparator.comparing(Employee::getHiredate)).findFirst();
return emp;
	}
	 public void NoofEmployeesInDepartment(){

		 Emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment)).forEach((k,v)-> System.out.println(k.getDepartmentName()+" : employees count is:"+v.size() ));

	    }


}




