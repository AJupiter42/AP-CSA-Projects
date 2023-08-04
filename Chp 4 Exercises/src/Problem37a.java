
import java.util.Scanner;

public class Problem37a { 
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int entry = -1; 
		int fact = 1; 
		
		while (entry < 0) {
			
			System.out.print("Enter non-negative integer: "); 
			entry = input.nextInt();
			
		}
		
		int n = entry; 
		
		while (n > 0) {
			
			fact *= n; 
			n--; 
			
		}
		
		System.out.printf("%d! is %d", entry, fact); 
		
	}

} 