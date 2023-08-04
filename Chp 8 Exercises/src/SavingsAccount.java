
public class SavingsAccount {
	
	public static double annualInterestRate;
	private double savingsBalance; 
	
	public SavingsAccount(double savingsBalance) {
		
		this.savingsBalance = savingsBalance;
		
	}

	public double calculateMonthlyInterest() {
		
		double monthlyInterest = savingsBalance * annualInterestRate / 12; 
		savingsBalance += monthlyInterest; 
		return monthlyInterest; 
		
	}
	
	public static void modifyInterestRate(double newRate) {
		
		annualInterestRate = newRate/100; 
		
	}
	
	public double getSavingsBalance() {
		
		return savingsBalance;  
		
	}

} 
