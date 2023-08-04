
public class Employee {

	private String Fname; 
	private String Lname; 
	private int socialSecurityNumber;
	
	public Employee(String Fname, String Lname, int socialSecurityNumber) {
		
		this.Fname = Fname; 
		this.Lname = Lname; 
		this.socialSecurityNumber = socialSecurityNumber; 
		
	} 
	
	public String getFname() {
		
		return Fname;
		
	}

	public void setFname(String fname) {
		
		Fname = fname;
		
	}

	public String getLname() {
		
		return Lname;
		
	}

	public void setLname(String lname) {
		
		Lname = lname;
		
	}

	public int getSocialSecurityNumber() {
		
		return socialSecurityNumber;
		
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		
		this.socialSecurityNumber = socialSecurityNumber;
		
	}
	
	@Override
	public String toString() {
		
		return String.format("First Name: %s\n Last Name: %s\n Social Security Number: %d\n", 
				Fname, Lname, socialSecurityNumber); 
		
	}
	
}
