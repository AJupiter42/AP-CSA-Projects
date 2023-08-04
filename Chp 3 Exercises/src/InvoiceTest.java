import java.util.Scanner;

public class InvoiceTest {
	
	public static void main(String[] args) {
		
		Invoice invoice1 = new Invoice("N/A", "N/A", 0, 0);
		
		// create Scanner object for input
		Scanner input = new Scanner(System.in);
		
		// get invoice info 
		System.out.print("Enter part number: "); // prompt user for part number
		String PartNumber = input.nextLine(); // obtain part number
		invoice1.setPartNumber(PartNumber); // set part number in invoice object 
		
		System.out.print("Enter part description: "); // prompt user for part description
		String PartDescription = input.nextLine(); // obtain part description
		invoice1.setPartDescription(PartDescription); // set part description in invoice object 
		
		System.out.print("Enter quantity purchased: "); // prompt user for quantity purchased
		int QuantityPurchased = input.nextInt(); // obtain quantity purchased
		invoice1.setQuantityPurchased(QuantityPurchased); // set quantity purchased in invoice object 
		
		System.out.print("Enter price per item: "); // prompt user for price per item
		double PricePerItem = input.nextDouble(); // obtain price per item
		invoice1.setPricePerItem(PricePerItem); // set price per item in invoice object 
		
		// print blank line
		System.out.println();
		
		// display invoice info and amount
		System.out.printf("Part Number: %s%n", invoice1.getPartNumber());
		System.out.printf("Part Description: %s%n", invoice1.getPartDescription());
		System.out.printf("Quantity Purchased: %d%n", invoice1.getQuantityPurchased());
		System.out.printf("Price Per Item: $%.2f%n", invoice1.getPricePerItem());
		System.out.printf("Total: $%.2f", invoice1.getInvoiceAmount(QuantityPurchased, PricePerItem));
		
	}

}
