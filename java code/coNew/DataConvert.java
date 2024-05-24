package in.coNew;

import java.sql.Date;

public class DataConvert {
	

	private String Name = null;
	
	private  Date Dob ;
	private String Address = null;
	
	public void  setName(String name) {
		this.Name = name;
	}
	public String getName() {
		return Name;
	}
	public void setDob(int i, int j, int k, Date DOB) {
		this.Dob = DOB;
	}
	public Date getDob() {
		return Dob;
	}
	public void setAddress(String add) {
		this.Address = add;
	}
	public String getAddress() {
		return Address;
	}	
	
	public static void main(String[] args) {
		Date d = new Date(0, 0, 0);
		DataConvert de;
		de = new DataConvert();
		de.setName("Vishal");
//		de.setDob();
		de.setAddress("Indore");
		
		System.out.println(de.getName());
//		System.out.println(de.getDob());
		System.out.println(de.getAddress());
	}
	
	
	
	
	
}
