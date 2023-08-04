
import java.util.Scanner;

public class Problem37b {
	
	public static void main(String[] args) {
		
		int terms = -1;
		int counter = 1; 
		double e = 1; 
		
		Scanner input = new Scanner(System.in);
		
		while (terms < 0) {
		
		System.out.print("Enter number of terms to calculate: "); 
		terms = input.nextInt();
		
		
		
		}
		
		while (counter <= terms) {
			
			e += 1/(double)getFactorial(counter);
			counter++;
			
		}
		
		System.out.printf("e is %.2f", e); 
	
	} 
	
	public static int getFactorial (int n) {
		
		int fact = 1; 
		
		if (n > 0) {
		
			while (n > 0) {
				
				fact *= n;
				n--;
				
			}
			
		} 
		
		return fact; 
	}
	
} 
