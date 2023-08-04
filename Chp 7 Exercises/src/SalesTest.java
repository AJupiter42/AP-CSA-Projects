
import java.util.Scanner;

public class SalesTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		double[][] sales = new double[6][5]; 

		for (int i = 0; i < 5; i++) { 
			 
			System.out.printf("Enter $ Sales of Salesperson 1 for Product %d: ", i+1);
			sales[i][0] = input.nextInt();
			System.out.printf("Enter $ Sales of Salesperson 2 for Product %d: ", i+1);
			sales[i][1] = input.nextInt(); 
			System.out.printf("Enter $ Sales of Salesperson 3 for Product %d: ", i+1);
			sales[i][2] = input.nextInt();
			System.out.printf("Enter $ Sales of Salesperson 4 for Product %d: ", i+1);
			sales[i][3] = input.nextInt();
			System.out.printf("Enter $ Sales of Salesperson 5 for Product %d: ", i+1);
			sales[i][4] = input.nextInt(); 
			
			System.out.println();
			
		} 
		
		Sales LastMonthSales = new Sales(sales); 
		
		LastMonthSales.outputSales(); 

	}

} 
