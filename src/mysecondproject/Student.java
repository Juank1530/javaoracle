package mysecondproject;

public class Student {
	
	private String fName; 
	private String lName; 
	private String stuId; 
	private String stuStatus;
	
	public String toString(){
		String s1 = "";
		s1 = "Student Name: " + getlName()
			+  "Student ID: " + getStuId()
			+  "Student Status: " + getStatus();
		return s1;
		
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public String getStatus() {
		return stuStatus;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String isStuStatus() {
		return stuStatus;
	}
	public void setStuStatus(String stuStatus) {
		this.stuStatus = stuStatus;
	}
	
	
	

}
