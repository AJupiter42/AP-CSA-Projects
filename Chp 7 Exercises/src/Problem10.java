
import java.util.Scanner; 

public class Problem10 {

	public static void main(String[] args) {
		
		String[] Header = {"$200-$299 ", "$300-$399 ", "$400-$499 ", "$500-$599 ", "$600-$699 ", "$700-$799 ", "$800-$899 ", "$900-$999 ", "$1000+ ",};   
		int[] Commission = new int[9]; 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number of Sales People: ");
		int numppl = input.nextInt(); 
		
		int sales; 
		double commission; 
		
		for(int i = 0; i < numppl; i++) {
			
			System.out.printf("Enter Gross Sales of Salesperson %d: ", i+1);
			sales = input.nextInt(); 
			commission = 200 + sales*0.09; 
			
			if(commission >= 200 && commission <= 299)
				Commission[0] += 1; 
					
			if(commission >= 300 && commission <= 399)
				Commission[1] += 1; 
			
			if(commission >= 400 && commission <= 499)
				Commission[2] += 1; 
			
			if(commission >= 500 && commission <= 599)
				Commission[3] += 1; 
			
			if(commission >= 600 && commission <= 699)
				Commission[4] += 1; 
			
			if(commission >= 700 && commission <= 799)
				Commission[5] += 1; 
			
			if(commission >= 800 && commission <= 899)
				Commission[6] += 1; 
			
			if(commission >= 900 && commission <= 999)
				Commission[7] += 1; 
			
			if(commission >= 1000)
				Commission[8] += 1; 
				
			}
		
		System.out.println(); 
		
		for(int i = 0; i < 9; i++)
			System.out.print(Header[i]); 
		
		System.out.println(); 
		
		for(int i = 0; i < 9; i++)
			System.out.print(Commission[i] + "         "); 
			
		}
		
	}
