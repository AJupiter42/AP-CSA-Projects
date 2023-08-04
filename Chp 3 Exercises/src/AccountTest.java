
// Driver class to manipulate Account objects
import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args) {
		
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		
		// display initial balance of each object
		System.out.printf("%s balance: $%.2f%n",
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n",
				account2.getName(), account2.getBalance());
		
		// create a Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter account name: "); 
		String accountname = input.nextLine();
		
		if (accountname == "account1") {
			
			account1.displayAccount(account1);
			
		}
		
		if (accountname == "account2") {
			
			account2.displayAccount(account1);
			
		}
			
	}

} 
