
package Problem16;

public class HourlyEmployee extends Employee {
	
	private double hours;
	private double wage;
	
	public HourlyEmployee(String Fname, String Lname, String socialSecurityNumber, double hours, double wage) {
		
		super(Fname, Lname, socialSecurityNumber); 
		
		this.setHours(hours); 
		this.setWage(wage); 
		
	}

	public double getHours() {
		
		return hours;
		
	}

	public void setHours(double hours) {
		
		if (hours < 0 || hours > 168) {
			
			throw new IllegalArgumentException (
				"Invalid Hours"); 
			
		}
		
		this.hours = hours;
		
	}

	public double getWage() {
		
		return wage;
		
	}

	public void setWage(double wage) {
		
		if (wage < 0) {
			
			throw new IllegalArgumentException (
				"Invalid Wage"); 
			
		}
		
		this.wage = wage;
		
	} 
	
	@Override
	public double getPaymentAmount() {
		
		if (getHours() <= 40) // no overtime
			return getWage() * getHours(); 
		
		else
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		
	}
	
	@Override
	public String toString() {
		
		return String.format("First Name: %s\n Last Name: %s\n Social Security Number: %s\n Earnings: $%.2f\n Hours Worked: %.2f\n Hourly Wage: $%.2f", 
				super.toString(), this.getHours(), this.getWage()); 
		
	}
	
} 
