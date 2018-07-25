package springhelloworld;

//Bean or Model Or POJO
public class Employee {
	
	// Attributes
	int eid;
	String ename;
	String eaddress;

	//Methods
	public Employee() {
		
	}
		//Field constructor
	public Employee(int eid, String ename, String eaddress) {
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
	}
	
		//getter setter
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

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
			
			//tostring
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + "]";
	}
	
	
}
