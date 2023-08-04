
package Problem16;

public class CommissionEmployee extends Employee {
	
	private double grossSales; 
	private double commissionRate; 
	
	public CommissionEmployee(String Fname, String Lname, String socialSecurityNumber, double grossSales, double commissionRate) {
		
		super(Fname, Lname, socialSecurityNumber); 
		
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0"); 
		
		if (grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		
		this.grossSales = grossSales; 
		this.commissionRate = commissionRate; 
		
	} 

	public double getGrossSales() {
		
		return grossSales;
		
	}

	public void setGrossSales(int grossSales) {
		
		if (grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		
		this.grossSales = grossSales;
		
	}
	
	public double getCommissionRate() {
		
		return commissionRate;
		
	}

	public void setCommissionRate(int commissionRate) {
		
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0"); 
		
		this.commissionRate = commissionRate;
		
	}
	
	@Override
	public double getPaymentAmount() {
		
		return getCommissionRate() * getGrossSales(); 
		
	}
	
	@Override
	public String toString() {
		
		return String.format("First Name: %s\n Last Name: %s\n Social Security Number: %s\n Gross Sales: $%.2f\n Commission Rate: %.2f\n Earnings: $%.2f", 
				super.toString(), this.getGrossSales(), this.getCommissionRate(), this.getPaymentAmount()); 
		
	}
	
} 
