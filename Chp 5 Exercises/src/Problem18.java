
public class Problem18 {
	
	public static void main(String[] args) {
		
		int amount = 0;
		int principal = 100000; 
		int rate = 5; 
		
		// display headers 
		System.out.printf("%s%20s%n", "Year", "Amount on deposit");
		
		// calculate amount on deposit for each of ten years 
		for (int year = 1; year <= 10; ++year) {
			
			// calculate new amount for specified year
			amount = principal * (int) Math.pow(1.0 + rate, year); 
			
			// display year and amount 
			System.out.printf("%4d%,20d%n", year, amount); 
			
		} 
		
	}

} 
