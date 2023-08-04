
public class SavingsAccountTest {
	
	public static void main(String[] args) {
		
		SavingsAccount saver1 = new SavingsAccount(2000.00); 
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		SavingsAccount.modifyInterestRate(4); 
		
		System.out.println("The annual interest rate is 4%\n"); 
		
		for (int i = 0; i < 12; i++) {
			
			System.out.printf("Saver1's interest for Month 1 is: %.2f\n", saver1.calculateMonthlyInterest()); 
			System.out.printf("Saver1's balance for Month %d is: %.2f\n\n", i+1, saver1.getSavingsBalance()); 
			
		}
		
		System.out.println();
		
		for (int i = 0; i < 12; i++) {
			
			System.out.printf("Saver2's interest for Month 1 is: %.2f\n", saver2.calculateMonthlyInterest()); 
			System.out.printf("Saver2's balance for Month %d is: %.2f\n\n", i+1, saver2.getSavingsBalance()); 
			
		}
		
		System.out.println();
		
		SavingsAccount.modifyInterestRate(5); 
		
		System.out.println("The annual interest rate is now 5%\n"); 
		
		System.out.printf("Next month's interest rate for Saver1 is %.2f percent\n", saver1.calculateMonthlyInterest());
		
		System.out.printf("Saver1's balance for next month is: %.2f\n\n", saver1.getSavingsBalance()); 
		
		System.out.printf("Next month's interest rate for Saver2 is %.2f percent\n", saver2.calculateMonthlyInterest());
		
		System.out.printf("Saver2's balance for next month is: %.2f\n\n", saver2.getSavingsBalance()); 
		
		
	}

}
