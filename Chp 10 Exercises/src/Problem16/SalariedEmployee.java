
package Problem16;

public class SalariedEmployee extends Employee {
	
	private double weeklySalary;
	
	public SalariedEmployee(String Fname, String Lname, String socialSecurityNumber, double weeklySalary) {
		
		super(Fname, Lname, socialSecurityNumber); 
		
		if (weeklySalary < 0.0)
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0"); 
		
		this.weeklySalary = weeklySalary; 
		
	}

	public double getWeeklySalary() {
		
		return weeklySalary;
		
	}

	public void setWeeklySalary(double weeklySalary) {
		
		if (weeklySalary < 0.0)
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0"); 
		
		this.weeklySalary = weeklySalary; 
		
	}
	
	@Override
	public double getPaymentAmount() {
		
		return getWeeklySalary(); 
		
	}
	
	@Override
	public String toString() {
		
		return String.format("First Name: %s\n Last Name: %s\n Social Security Number: %s\n Earnings: $%.2f, Weekly Salary: $%.2f", 
				super.toString(), this.getWeeklySalary()); 
		
	}
	
} 
