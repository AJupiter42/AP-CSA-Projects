
package Problem16;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	private double baseSalary; 
	
	public BasePlusCommissionEmployee(String Fname, String Lname, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
		
		super(Fname, Lname, socialSecurityNumber, grossSales, commissionRate); 
		
		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		this.baseSalary = baseSalary; 
		
	} 

	public double getBaseSalary() {
		
		return baseSalary;
		
	}

	public void setBaseSalary(double baseSalary) {
		
		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		this.baseSalary = baseSalary;
		
	}
	
	@Override
	public double getPaymentAmount() {
		
		return getBaseSalary() + super.getPaymentAmount(); 
		
	} 
	
	@Override
	public String toString() {
		
		return String.format("First Name: %s\n Last Name: %s\n Social Security Number: %s\n Gross Sales: $%.2f\n Commission Rate: %.2f\n Earnings: $%.2f\n Base Salary: %d",
				super.toString(), getBaseSalary()); 
		
		
		
	}

} 
