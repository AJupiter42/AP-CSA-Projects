
public class CommissionEmployee extends Employee {
	
	private double grossSalary; 
	private double commissionRate; 
	
	public CommissionEmployee(String Fname, String Lname, int socialSecurityNumber, double grossSalary, double commissionRate) {
		
		super(Fname, Lname, socialSecurityNumber); 
		
		this.grossSalary = grossSalary; 
		this.commissionRate = commissionRate; 
		
	} 
	
	public double Earning() {
		
		return grossSalary * commissionRate; 
		
	}

	public double getGrossSalary() {
		
		return grossSalary;
		
	}

	public void setGrossSalary(int grossSalary) {
		
		this.grossSalary = grossSalary;
		
	}
	
	public double getCommissionRate() {
		
		return commissionRate;
		
	}

	public void setCommissionRate(int commissionRate) {
		
		this.commissionRate = commissionRate;
		
	}
	
	@Override
	public String toString() {
		
		return String.format("First Name: %s\n Last Name: %s\n Social Security Number: %d\n Gross Salary: %.2f\n Commission Rate: %.2f\n Earning: %.2f", 
				this.getFname(), this.getLname(), this.getSocialSecurityNumber(), grossSalary, commissionRate, this.Earning()); 
		
	}
	
}
