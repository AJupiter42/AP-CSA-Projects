
import java.util.Scanner; 

public class Problem17 {
	
	public static void main(String args[]) {
		
		int productID = 1; 
		int quantity = 0; 
		double price = 0; 
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter product ID from 1-5: "); 
		productID = input.nextInt();
		
		while (productID != 0) {
			
			if (productID >= 1 && productID <= 5) {
					
				System.out.println("Enter quantity: ");
				quantity = input.nextInt(); 
					
				switch (productID) {
					
				case 1: 
					double product1 = 2.98;
					price = product1 * quantity; 
					break; 
						
				case 2: 
					double product2 = 4.50; 
					price = product2 * quantity; 
					break;
						
				case 3: 
					double product3 = 9.98; 
					price = product3 * quantity; 
					break;
						
				case 4: 
					double product4 = 4.49; 
					price = product4 * quantity; 
					break; 
						
				case 5: 
					double product5 = 6.87; 
					price = product5 * quantity; 
					break; 
						
					}
					
				}
				
				else if (productID != 0) 
					
					System.out.print("Product ID must be between 1-5");
					System.out.println("Enter product ID");
					productID = input.nextInt(); 
					
				}
		
			System.out.printf("The total price is %.2f", price);
		
		} 
		
}
