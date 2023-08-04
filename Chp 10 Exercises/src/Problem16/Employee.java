
package Problem16;

public abstract class Employee implements Payable { 

	private final String Fname; 
	private final String Lname; 
	private final String socialSecurityNumber;
	
	public Employee(String Fname, String Lname, String socialSecurityNumber) {
		
		this.Fname = Fname; 
		this.Lname = Lname; 
		this.socialSecurityNumber = socialSecurityNumber; 
		
	} 

	public String getFname() {
		
		return Fname;
		
	}

	public String getLname() {
		
		return Lname;
		
	}

	public String getSocialSecurityNumber() {
		
		return socialSecurityNumber;
		
	}
		
	@Override
	public String toString() { 
		
		return String.format("First Name: %s\nLast Name: %s\nSocial Security Number: %s\n", 
				getFname(), getLname(), getSocialSecurityNumber());
		
	}
	
}
