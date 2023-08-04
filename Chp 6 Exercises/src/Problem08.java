
import java.util.Scanner; 

public class Problem08 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter hours parked for Customer 1: "); 
		double cust1 = input.nextDouble();
		if (cust1 <= 24)
			System.out.printf("The charge for Customer 1 is: $%.2f\n", calculateCharges(cust1)); 
		
		System.out.print("Enter hours parked for Customer 2: "); 
		double cust2 = input.nextDouble();
		if (cust2 <= 24)
			System.out.printf("The charge for Customer 2 is: $%.2f\n", calculateCharges(cust2)); 
		
		System.out.print("Enter hours parked for Customer 3: "); 
		double cust3 = input.nextDouble();
		if (cust3 <= 24)
			System.out.printf("The charge for Customer 3 is: $%.2f\n", calculateCharges(cust3)); 
	
	} 
	
	public static double calculateCharges(double hours) {
		
		double charge = 2.00; 
		double hourlycharge = 0.50; 
		double minutecharge = 0.50/60; 
		double maxcharge = 10.00;
		
		if (hours <= 3) { 
			
			int count = (int) hours; 
			
			for (int i = 0; i < count; i++) {
				
				charge += hourlycharge;
				
			}
		
		}
		
		if (hours > 3) {
			
			for (int i = 0; i < 3; i++) {
				
				charge += hourlycharge;
				hours--; 
				
			}
			
			double minutes = hours * 60; 
		
			while (charge <= maxcharge && minutes > 0) {
			
				charge += minutecharge; 
				minutes--; 
				
			}
	
		}
		
		return charge; 
		
	}

} 
