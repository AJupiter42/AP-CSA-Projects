
import java.util.Scanner;
// Account class that contains a name instance variable and methods to set and get its value

public class Account {

	private String name; // instance variable
	private double balance; // instance variable
	
	// Account constructor that receives two parameters
	public Account(String name, double balance) { // constructor name is class name
	
		this.name = name;
	
		/* validate that the balance is greater than 0.0, if it's not,
		instance variable balance keeps its default initial value of 0.0*/
		if (balance > 0.0) 
			this.balance = balance; 
		
	}
	
	// method that deposits only a valid amount to the balance
	public void deposit(double depositAmount) {
		
		if (depositAmount > 0.0)
			balance = balance + depositAmount; 
		
	}
	
	// method to withdraw amount from balance
	public void withdraw(double withdrawAmount) {
		
		if (withdrawAmount <= balance)
			balance = balance - withdrawAmount;
		else 
			System.out.println("Withdraw amount exceeded account balance");
		
	}
	
	// method returns the account balance
	public double getBalance() {
		
		return balance;
		
	}
		
	// method to set the name in the object
	public void setName(String name) {
	
		this.name = name; // store the name
		
	}
	
	// method to retrieve the name from the object
	public String getName() {
		
		return name; // return value of name to caller
		
	}
		
	public void displayAccount(Account accountobj) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account: "); // prompt
		double depositAmount = input.nextDouble(); // obtain user input
		System.out.printf("%nAdding %.2f to account balance%n%n", 
				depositAmount);
		accountobj.deposit(depositAmount); // withdraw from account's balance
		
		System.out.print("Enter withdraw amount for account: "); // prompt
		double withdrawAmount = input.nextDouble(); // obtain user input
		System.out.printf("%nWithdrawing %.2f from account balance%n%n", 
				withdrawAmount);
		accountobj.withdraw(withdrawAmount); // withdraw from account's balance
		
		// display balance
		System.out.printf("%s balance: $%.2f%n",
				accountobj.getName(), accountobj.getBalance());
		
	}
		
}
