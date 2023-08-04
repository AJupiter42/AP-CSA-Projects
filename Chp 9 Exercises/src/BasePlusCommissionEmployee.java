
public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	private double baseSalary; 
	
	public BasePlusCommissionEmployee(String Fname, String Lname, int socialSecurityNumber, double baseSalary, double grossSalary, double commissionRate) {
		
		super(Fname, Lname, socialSecurityNumber, grossSalary, commissionRate); 
		
		this.baseSalary = baseSalary; 
		
	} 
	
	@Override
	public double Earning() {
		
		return baseSalary + super.Earning(); 
		
	} 

	public double getBaseSalary() {
		
		return baseSalary;
		
	}

	public void setBaseSalary(int baseSalary) {
		
		this.baseSalary = baseSalary;
		
	}
	
	@Override
	public String toString() {
		
		return String.format("First Name: %s\n Last Name: %s\n Social Security Number: %d\n Base Salary: %.2f\n Gross Salary: %.2f\n CommissionRate: %.2f\n Earning: %.2f", 
				this.getFname(), this.getLname(), this.getSocialSecurityNumber(), this.getBaseSalary(), this.getGrossSalary(), this.getCommissionRate(), this.Earning()); 
		
		
	}

} 
