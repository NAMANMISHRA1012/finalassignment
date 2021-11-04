package com.caseStudy;

public class Department extends Employee {
	
	   private int departmentId;
	    private String departmentName;
	    private int managerId;
		public Department() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Department(int departmentId, String departmentName, int managerId) {
			super();
			this.departmentId = departmentId;
			this.departmentName = departmentName;
			this.managerId = managerId;
		}
		public int getDepartmentId() {
			return departmentId;
		}
		public void setDepartmentId(int departmentId) {
			this.departmentId = departmentId;
		}
		public String getDepartmentName() {
			return departmentName;
		}
		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}
		public int getManagerId() {
			return managerId;
		}
		public void setManagerId(int managerId) {
			this.managerId = managerId;
		}
		
		
		@Override
		public String toString() {
			return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", managerId="
					+ managerId + "]";
		}
	    
	    
	

}
