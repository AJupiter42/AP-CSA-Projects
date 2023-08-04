
import java.util.Scanner;

public class Problem37c {
	
	public static void main(String[] args) {
		
		int terms = -1; 
		int counter = 1; 
		double x = 0; 
		double power = 1; 
		double e = 1; 
		
		Scanner input = new Scanner(System.in);
		
		while (terms < 0) {
		
		System.out.print("Enter number of terms to calculate: "); 
		terms = input.nextInt();
		
		} 
		
		System.out.print("Enter power of e: ");
		x = input.nextDouble(); 
		
		while (counter <= terms) {
			
			e += x/(double)getFactorial(counter);
			counter++;
			x = Math.pow(x, power);
			power++; 
			
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
