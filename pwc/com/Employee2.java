package pwc.com;

public class Employee2 {
	private int eid;
	private String ename;
	

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


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e2 = new Employee2();
		e2.setEid(1);
		e2.setEname("naman");
		System.out.println(e2);
		System.out.println();

	}

}
