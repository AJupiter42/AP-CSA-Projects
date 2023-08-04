
public class HourlyEmployee extends Employee {
	
	private double hours;
	private double wage;
	
	public HourlyEmployee(String Fname, String Lname, int socialSecurityNumber, double hours, double wage) {
		
		super(Fname, Lname, socialSecurityNumber); 
		
		this.hours = hours; 
		this.wage = wage; 
		
	}
	
	public double Earning() {
		
		return hours * wage; 
		
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
	public String toString() {
		
		return String.format("First Name: %s\n Last Name: %s\n Social Security Number: %d\n Hourly Wage: %.2f\n Hours Worked: %.2f\n Earning: %.2f", 
				this.getFname(), this.getLname(), this.getSocialSecurityNumber(), wage, hours, this.Earning()); 
		
	}
	
} 
