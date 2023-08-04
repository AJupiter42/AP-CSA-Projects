
public class Sales {

	private double[][] sales; 
	
	public Sales(double[][] sales) {
		
		this.sales = sales; 
		
	}
	
	public double getProductTotalSales(double[] sales) {
		
		double total = 0;
		 
		for (double salesperson : sales)
			total += salesperson;
			
		return total;
		
	} 
	
	public double getSalespersonTotalSales(double[][] sales, int sp) {
		
		double total = 0;
		
		for (int i = 0; i < 5; i++) 
			total += sales[i][sp];
			
		return total;
		
	} 
	
	public void outputSales() {
		
		System.out.print("            "); 
		
		System.out.print("Salesperson 1     ");
		System.out.print("Salesperson 2     ");
		System.out.print("Salesperson 3     ");
		System.out.print("Salesperson 4     ");
		System.out.print("Salesperson 5     ");
		System.out.println("Total"); 
		
		for (int product = 0; product < 5; product++) {
			
			System.out.printf("Product %d", product+1);
			
			for (double sale : sales[product])
				System.out.printf("%16.2f", sale); 
			
			double total = getProductTotalSales(sales[product]); 
			System.out.printf("%18.2f", total); 
			
			System.out.println();
			
		}
		
		for (int salesperson = 0; salesperson < 5; salesperson++) {
			
			double total = getSalespersonTotalSales(sales, salesperson); 
			System.out.printf("%18.2f", total); 
			
		}
		
	}

} 
