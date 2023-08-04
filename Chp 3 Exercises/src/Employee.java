
public class Employee {
	
	// instance variables
	private String FName;
	private String LName;
	private double MonthlySalary; 
	
	// Employee constructor
	public Employee(String FName, String LName, double MonthlySalary) {
		
		this.FName = FName;
		this.LName = LName;
		this.MonthlySalary = MonthlySalary;
		
	}
	
	public void setFirstName(String FName) {
		
		this.FName = FName;
		
	}
	
	public void setLastName(String LName) {
		
		this.LName = LName;
		
	}
	
	public void setMonthlySalary(double MonthlySalary) {
		
		if (MonthlySalary > 0) 
			this.MonthlySalary = MonthlySalary; 
		else
			System.out.print("ERROR: Enter positive salary");
	}
	
	public String getFirstName() {
		
		return FName;
	}
	
	public String getLastName() {
		
		return LName;
	}
	
	public double getMonthlySalary() {
		
		return MonthlySalary;
	}
	
}
