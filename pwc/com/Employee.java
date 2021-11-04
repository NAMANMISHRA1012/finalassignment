package pwc.com;

public class Employee {
	
		
	
	public int eid;
	public String ename;
	public int salary;
	
	
	
	public Employee(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
		
	
	Employee e1 = new Employee(101,"naman",10000);

	
	System.out.println(e1.getEid());
	System.out.println(e1.getEname());
	
	
	
	
	}
}
